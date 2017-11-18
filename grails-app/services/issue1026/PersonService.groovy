package issue1026

import grails.gorm.transactions.Transactional

@Transactional(readOnly = true)
class PersonService {

    Number countPeopleThatHaveAFirstName() {
        Person.where {
            firstName != null
        }.count()
    }

    Number countPeopleWithNoFirstName() {
         Person.where {
            firstName == null
        }.count()
    }
}
