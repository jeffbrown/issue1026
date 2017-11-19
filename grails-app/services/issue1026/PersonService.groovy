package issue1026

import grails.gorm.DetachedCriteria
import grails.gorm.transactions.Transactional

@Transactional(readOnly = true)
class PersonService {

    Number countPeopleThatHaveAFirstName() {
        new DetachedCriteria(Person).where {
            isNotNull "firstName"
        }.count()
    }

    Number countPeopleWithNoFirstName() {
         new DetachedCriteria(Person).where {
            isNull "firstName"
        }.count()
    }
}
