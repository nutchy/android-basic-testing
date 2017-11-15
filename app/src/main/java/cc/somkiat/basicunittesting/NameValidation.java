package cc.somkiat.basicunittesting;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.Model.ResultValidation;

class NameValidation implements Validation{

    @Override
    public ResultValidation validate(String name) {
        try {
            isEmpty(name);
            isNull(name);
            notInRange(name);
            isNotContainAlphabet(name);
        } catch (Exception e) {
            return new ResultValidation(false, e.getMessage());
        }
        return new ResultValidation(true, "Name is correct pattern");
    }

    public void isEmpty(String name) throws NameException {
        if(name.isEmpty()){
            throw new NameException("Name is Empty");
        }
    }

    public void isNull(String name) throws NameException {
        if(name == null){
            throw new NameException("Name is null");
        }
    }

    public void notInRange(String name) throws NameException {
        if (name.length() < 2 || name.length() > 20){
            throw new NameException("Name length is more than 20 char, less than 2 char");
        }
    }

    public void isNotContainAlphabet(String name) throws NameException {
         if(!name.matches("[a-zA-Z]+")){
             throw new NameException("Some char in name is not contain Alphabet");
         }
    }
}
