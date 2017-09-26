package com.src.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidation {
	
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
    		.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public static boolean isEmail(String emailAddress) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailAddress);
        return matcher.find();
    }

    
    @Test
    public void testCorrectEmail(){
    	Assert.assertTrue(isEmail("yashx1@gmail.com"));
    }

    @Test
    public void testInCorrectEmail1(){
    	Assert.assertFalse(isEmail("yashx1"));
    }

    @Test
    public void testInCorrectEmail2(){
    	Assert.assertFalse(isEmail("yashx1.com"));
    }
    
    @Test
    public void testInCorrectEmail3(){
    	Assert.assertFalse(isEmail("yashx1@gmailcom"));
    }
        
    @Test
    public void testInCorrectEmail4(){
    	Assert.assertFalse(isEmail("yashx1@gmail."));
    }

    @Test
    public void testInCorrectEmail5(){
    	Assert.assertFalse(isEmail("yashx1@gmail,com"));
    }

}
