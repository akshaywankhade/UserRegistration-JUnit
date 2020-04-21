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
    //Last Name
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean LastName = userRegistration.ValidationLastName("Wankhade");
        Assert.assertTrue(LastName);
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean LastName = userRegistration.ValidationLastName("wankhade");
        Assert.assertFalse(LastName);
    }
    //Email ID
    @Test
    public void givenEmailID_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean EmailID = userRegistration.ValidationEmailID("akshayWankhade23@gmail.com");
        Assert.assertTrue(EmailID);
    }
    @Test
    public void givenEmailID_WhenInvalid_ShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();
        boolean EmailID = userRegistration.ValidationEmailID("akshayWakhade23.com");
        Assert.assertFalse(EmailID);
    }
    //Mobile Number
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean MobileNum = userRegistration.ValidationMobileNum("91 8308213412");
        Assert.assertTrue(MobileNum);
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean MobileNum = userRegistration.ValidationMobileNum("911 83021654451");
        Assert.assertFalse(MobileNum);
    }
    //Password
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean Password = userRegistration.ValidationPassword("Akshay@123");
        Assert.assertTrue(Password);
    }
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean Password = userRegistration.ValidationPassword("akshay123");
        Assert.assertFalse(Password);
    }
}

