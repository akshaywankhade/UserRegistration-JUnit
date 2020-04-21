package com.bl.user;

public class UserRegistration {
    public static final String FirstName_Pattern="^[A-Z][a-z]{2,}$";
    public static final String LastName_Pattern="^[A-Z][a-z]{2,}$";

    public boolean ValidationFirstName(String firstName) {
        return firstName.matches(FirstName_Pattern);
    }
    public boolean ValidationLastName(String lastName){
        return lastName.matches(LastName_Pattern);
    }

}
