package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by nutchy on 15/11/2017 AD.
 */

public class EmailValidationTest {
    @Test
    public void isNull(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isNull(null);
        assertTrue("",result);
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
