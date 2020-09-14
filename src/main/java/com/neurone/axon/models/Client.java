package com.neurone.axon.models;

import org.springframework.data.annotation.Id;


public class Client {

    private String lastname;
    private String firstname;
    private String mail;
    
    @Id
    private String id;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    
    public String getMail() {
        return mail;
    }
    
}
