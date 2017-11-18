package issue1026

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class PersonSpec extends GebSpec {

    void "test retriving people with a first name"() {
        when:
        go '/person/withFirstName'

        then:
        $().text() == 'There are 3 people with a first name.'
    }

    void "test retriving people without a first name"() {
        when:
        go '/person/withNoFirstName'

        then:
        $().text() == 'There are 0 people with no first name.'
    }
}
