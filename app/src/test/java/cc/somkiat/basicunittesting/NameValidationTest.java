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
    public void isEmpty(){
        user.setName("");
        ResultValidation result = nameValidation.validate(user.getName());
        assertFalse(result.getMessage(), result.getResult());
    }

    @Test
    public void isNull(){
        user.setName(null);
        ResultValidation result = nameValidation.validate(user.getName());
        assertFalse(result.getMessage(), result.getResult());
    }

    @Test
    public void isNotNull(){
        user.setName("Chayanon");
        ResultValidation result = nameValidation.validate(user.getName());
        assertTrue(result.getMessage(), result.getResult());
    }

    @Test
    public void lengthBetweenTwoAndTwenty(){
        user.setName("Somkiat");
        ResultValidation result = nameValidation.validate(user.getName());
        assertTrue(result.getMessage(), result.getResult());
    }

    @Test
    public void lengthLessThanTwo(){
        user.setName("s");
        ResultValidation result = nameValidation.validate(user.getName());
        assertFalse(result.getMessage(), result.getResult());
    }

    @Test
    public void lengthMoreThanTwo(){
        user.setName("abcdefghijklmnopabcdefghtjklmno");
        ResultValidation result = nameValidation.validate(user.getName());
        assertFalse(result.getMessage(), result.getResult());
    }

    @Test
    public void nameNotContainAlphabet(){
        ResultValidation result = nameValidation.validate("Somkiat1");
        assertFalse(result.getMessage(), result.getResult());
    }

    @Test
    public void nameContainAlphabet(){
        ResultValidation result = nameValidation.validate("Somkiat");
        assertTrue(result.getMessage(), result.getResult());
    }

    @Test
    public void nameNotContainSymbol(){
        ResultValidation result = nameValidation.validate("Somkiat@#$%^&");
        assertFalse(result.getMessage(), result.getResult());
    }
}
