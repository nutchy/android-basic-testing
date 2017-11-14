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
    public void lengthInRange(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.checkLength("Somkiat");
        assertTrue("", result);
    }

    @Test
    public void nameContainAlphabet(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.containAlphabet("Somkiat");
        assertTrue("", result);
    }
}
