package issue1026

import grails.gorm.DetachedCriteria
import grails.gorm.transactions.Transactional

@Transactional(readOnly = true)
class PersonService {

    Number countPeopleThatHaveAFirstName() {
        new DetachedCriteria(Person).where {
            firstName != null
        }.count()
    }

    Number countPeopleWithNoFirstName() {
         new DetachedCriteria(Person).where {
            firstName == null
        }.count()
    }
}
