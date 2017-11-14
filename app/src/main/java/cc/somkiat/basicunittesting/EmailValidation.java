package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

public class EmailValidation {

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public boolean isNull(String email) {
        return email == null;
    }

    public boolean isEmpty(String email) {
        return email.isEmpty();
    }

    public boolean isPattern(String email) {
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        return validEmailPattern.matcher(email).matches();
    }
}
