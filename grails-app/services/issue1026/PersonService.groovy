package issue1026

import grails.gorm.DetachedCriteria
import grails.gorm.transactions.Transactional

@Transactional(readOnly = true)
class PersonService {

    Number countPeopleThatHaveAFirstName() {
        createDetachedCriteria().where {
            firstName != null
        }.count()
    }

    Number countPeopleWithNoFirstName() {
         createDetachedCriteria().where {
            firstName == null
        }.count()
    }

    private DetachedCriteria<Person> createDetachedCriteria() {
        Person.where {}
    }
}
