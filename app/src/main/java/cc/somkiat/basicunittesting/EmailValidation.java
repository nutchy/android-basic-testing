package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

import cc.somkiat.basicunittesting.Exception.EmailException;
import cc.somkiat.basicunittesting.Model.ResultValidation;
import cc.somkiat.basicunittesting.Model.User;

public class EmailValidation {

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public ResultValidation validation(String email) {
        try {
            isNull(email);
            isEmpty(email);
            isNotPattern(email);
        } catch (Exception e) {
            return new ResultValidation(false, e.getMessage());
        }
        return new ResultValidation(true, "No Exception.");
    }


    public void isNull(String email) throws EmailException {
        if (email == null) {
            throw new EmailException("Email is null");
        }
    }

    public void isEmpty(String email) throws EmailException {
        if(email.isEmpty()){
            throw new EmailException("Email is Empty");
        }
    }

    public void isNotPattern(String email) throws EmailException {
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if (!validEmailPattern.matcher(email).matches()){
            throw new EmailException("Email is not Pattern");
        }
    }


}
