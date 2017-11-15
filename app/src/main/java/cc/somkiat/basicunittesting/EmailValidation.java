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


    public boolean isEmpty(String email) {
        return email.isEmpty();
    }

    public boolean isPattern(String email) {
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        return validEmailPattern.matcher(email).matches();
    }


}
