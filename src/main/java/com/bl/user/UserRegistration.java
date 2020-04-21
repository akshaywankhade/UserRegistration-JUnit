package com.bl.user;

public class UserRegistration {
    public static final String FirstName_Pattern="^[A-Z][a-z]{2,}$";

    public boolean ValidationFirstName(String firstName) {
        return firstName.matches(FirstName_Pattern);
    }
}
