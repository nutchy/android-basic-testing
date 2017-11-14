package cc.somkiat.basicunittesting;

class NameValidation {
    public boolean isEmpty(String name) {
        return name.isEmpty();
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
