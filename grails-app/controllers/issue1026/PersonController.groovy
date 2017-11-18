package issue1026

class PersonController {

    PersonService personService

    def withFirstName() {
        def count = personService.countPeopleThatHaveAFirstName()
        render "There are $count people with a first name."
    }

    def withNoFirstName() {
        def count = personService.countPeopleWithNoFirstName()
        render "There are $count people with no first name."
    }
}
