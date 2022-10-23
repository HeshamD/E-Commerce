package Entities;
import Exceptions.AccountException;
import Exceptions.WrongDataException;
import Validation.Validation;
public class User extends Validation{
    private String userName;
    private String passWord;
    public User(String userName, String passWord) throws AccountException {
        if(!isValidateInputString(userName)) throw new AccountException(new WrongDataException("Invalid username"));
        this.userName = userName;
        this.passWord = passWord;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) throws AccountException {
        if(!isValidateInputString(userName)) throw new AccountException(new WrongDataException("Invalid username"));
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
