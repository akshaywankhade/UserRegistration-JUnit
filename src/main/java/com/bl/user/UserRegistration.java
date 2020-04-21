package com.bl.user;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class UserRegistration {
    public static final String FirstName_Pattern="^[A-Z][a-z]{2,}$";

    public boolean ValidationFirstName(String firstName) {
        return firstName.matches(FirstName_Pattern);
    }
}
