package cc.somkiat.basicunittesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NameValidationTest {
    NameValidation nameValidation;

    @Before
    public void setup(){
        nameValidation = new NameValidation();
    }

    @Test
    public void caseEmpty(){
        boolean result = nameValidation.isEmpty("");
        assertTrue("", result);
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
