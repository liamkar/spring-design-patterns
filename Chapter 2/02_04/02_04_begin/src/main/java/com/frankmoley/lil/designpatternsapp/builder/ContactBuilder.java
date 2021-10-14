package com.frankmoley.lil.designpatternsapp.builder;

public class ContactBuilder {
 private String firstName;
 private String lastName;
 private String emailAddress;

 /*
public String getFirstName() {
    return firstName;
}
*/
public ContactBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
}
/*
public String getLastName() {
    return lastName;
}
*/
public ContactBuilder setLastName(String lastName) {
    this.lastName = lastName;
    return this;
}
/*
public String getEmailAddress() {
    return emailAddress;
}
*/
public ContactBuilder setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
}

public Contact buildContact() {
    return new Contact(firstName, lastName, emailAddress);
}
 

 
}
