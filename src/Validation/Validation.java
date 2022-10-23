package Validation;

public abstract class Validation {
    protected String expression = "'#$@%^&*()_!+=[]{};:,.'";

    protected boolean isValidateInputString(String input){
        if(input.length() == 0 ){
            return false;
        }
        if(isExpression(input)) return false;

        return true;
    }
    protected boolean isExpression(String input){
        if(input.contains(expression)){
            return false;
        }
        return true;
    }
    protected boolean isValidEmail(String email){
        if (isValidateInputString(email)) return false;
        return true;
    }
    protected boolean isValidPhoneNumber(String number){
        if(number.length()>15) return false;
        return true;
    }

}
