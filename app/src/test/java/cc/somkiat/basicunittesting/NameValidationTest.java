package cc.somkiat.basicunittesting;

import org.junit.Before;
import org.junit.Test;

import cc.somkiat.basicunittesting.Model.ResultValidation;
import cc.somkiat.basicunittesting.Model.User;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NameValidationTest {
    private NameValidation nameValidation;
    private User user;

    @Before
    public void setup(){
        nameValidation = new NameValidation();
        user = new User();
    }

    @Test
    public void caseEmpty(){
        user.setName("");
        ResultValidation result = nameValidation.validate(user.getName());
        assertFalse(result.getMessage(), result.getResult());
    }

    @Test
    public void isNull(){
        boolean result = nameValidation.isNull(null);
        assertTrue("", result);
    }

    @Test
    public void isNotNull(){
        boolean result = nameValidation.isNull("Hello");
        assertFalse("", result);
    }

    @Test
    public void lengthBetweenTwoAndTwenty(){
        boolean result = nameValidation.checkLength("Somkiat");
        assertTrue("", result);
    }

    @Test
    public void lengthLessThanTwo(){
        boolean result = nameValidation.checkLength("s");
        assertFalse("Name Length less than 2 char.", result);
    }

    @Test
    public void lengthMoreThanTwo(){
        boolean result = nameValidation.checkLength("abcdefghijklmnopabcdefghtjklmno");
        assertFalse("Name Length less than 2 char.", result);
    }

    @Test
    public void nameContainAlphabet(){
        boolean result = nameValidation.containAlphabet("Somkiat");
        assertTrue("", result);
    }
}
