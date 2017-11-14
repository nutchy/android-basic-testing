package cc.somkiat.basicunittesting;

class NameValidation {
    public boolean isEmpty(String name) {
        return name.isEmpty();
    }

    public boolean isNull(String name) {
        return name == null;
    }

    public boolean checkLength(String name) {
        if (name.length() < 2 || name.length() > 20){
            return false;
        }
        else return true;
    }

    public boolean containAlphabet(String name) {
        if (name.matches("[a-zA-Z]+")){
            return true;
        }
        else return false;
    }
}
