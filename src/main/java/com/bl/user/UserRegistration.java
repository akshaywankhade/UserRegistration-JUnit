package com.bl.user;

public class UserRegistration {
    public static final String FirstName_Pattern="^[A-Z][a-z]{2,}$";
    public static final String LastName_Pattern="^[A-Z][a-z]{2,}$";
    public static final String EmailID_pattern="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+[a-zA-Z]{2,4}$";

    public boolean ValidationFirstName(String firstName) {
        return firstName.matches(FirstName_Pattern);
    }
    public boolean ValidationLastName(String lastName){
        return lastName.matches(LastName_Pattern);
    }
    public boolean ValidationEmailID(String EmailID){
        return EmailID.matches(EmailID_pattern);
    }
}
