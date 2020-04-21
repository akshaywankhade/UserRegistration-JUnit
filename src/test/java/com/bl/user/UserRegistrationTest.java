package com.bl.user;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    //FIRST NAME
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean FirstName = userRegistration.ValidationFirstName("Akshay");
        Assert.assertTrue(FirstName);
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();
        boolean FirstName = userRegistration.ValidationFirstName("akshay");
        Assert.assertFalse(FirstName);
    }
}
