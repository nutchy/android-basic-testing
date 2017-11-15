package cc.somkiat.basicunittesting;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.Model.ResultValidation;

class NameValidation {

    public ResultValidation validate(String name){
        try {
            isEmpty(name);
        } catch (NameException e) {
            return new ResultValidation(false, e.getMessage());
        }
        return new ResultValidation(true, "Name is correct pattern");
    }

    public void isEmpty(String name) throws NameException {
        if(name.isEmpty()){
            throw new NameException("Name is Empty");
        }
    }

    public boolean isNull(String name) {
        return name == null;
    }

    public boolean checkLength(String name) {
        return (name.length() >= 2 && name.length() <= 20);
    }

    public boolean containAlphabet(String name) {
        return (name.matches("[a-zA-Z]+"));
    }
}
