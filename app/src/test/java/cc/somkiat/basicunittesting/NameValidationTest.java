package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NameValidationTest {
    @Test
    public void caseEmpty(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isEmpty("");
        assertTrue("", result);
    }

    @Test
    public void caseNull(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isNull(null);
        assertTrue("", result);
    }

    @Test
    public void lengthInRange(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.checkLength("Somkiat");
        assertTrue("", result);
    }
}
