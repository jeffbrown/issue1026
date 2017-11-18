package issue1026

class BootStrap {

    def init = { servletContext ->
        new Person(firstName: 'Jeff').save()
        new Person(firstName: 'Jake').save()
        new Person(firstName: 'Zack').save()
    }
    def destroy = {
    }
}
