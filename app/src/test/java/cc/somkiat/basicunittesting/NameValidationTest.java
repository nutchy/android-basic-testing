package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NameValidationTest {
    @Test
    public void caseEmpty(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isEmpty("");
        assertTrue("", result);
    }

    @Test
    public void isNull(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isNull(null);
        assertTrue("", result);
    }

    @Test
    public void isNotNull(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isNull("Hello");
        assertFalse("", result);
    }

    @Test
    public void lengthBetweenTwoAndTwenty(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.checkLength("Somkiat");
        assertTrue("", result);
    }

    @Test
    public void lengthLessThanTwo(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.checkLength("s");
        assertFalse("Name Length less than 2 char.", result);
    }

    @Test
    public void lengthMoreThanTwo(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.checkLength("abcdefghijklmnopabcdefghtjklmno");
        assertFalse("Name Length less than 2 char.", result);
    }

    @Test
    public void nameContainAlphabet(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.containAlphabet("Somkiat");
        assertTrue("", result);
    }
}
