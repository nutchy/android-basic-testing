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
}
