package my.scribe.template.models;

import org.springframework.data.annotation.Id;

public class Person {

    private String lastname;
    private String firstname;
    @Id
    private String id;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    
}
