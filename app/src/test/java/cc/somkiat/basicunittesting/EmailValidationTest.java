package cc.somkiat.basicunittesting;

import org.junit.Before;
import org.junit.Test;

import cc.somkiat.basicunittesting.Model.ResultValidation;
import cc.somkiat.basicunittesting.Model.User;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class EmailValidationTest {

    private User user;
    private EmailValidation emailValidation;


    @Before
    public void init(){
        user = new User();
        emailValidation = new EmailValidation();
    }

    @Test
    public void isNull(){
        user.setEmail(null);
        ResultValidation result = emailValidation.validation(user.getEmail());
        assertFalse(result.getMessage(),result.getResult());
    }

    @Test
    public void isNotNull(){
        user.setEmail("abc@xyz.com");
        ResultValidation result = emailValidation.validation(user.getEmail());
        assertTrue(result.getMessage(),result.getResult());
    }

    @Test
    public void isEmpty(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isEmpty("");
        assertTrue("", result);
    }

    @Test
    public void isPattern(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isPattern("abc@xyz.com");
        assertTrue("", result);
    }
}
