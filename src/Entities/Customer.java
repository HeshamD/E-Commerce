package Entities;

import Exceptions.AccountException;
import Exceptions.WrongDataException;
import Memento.CustomerState;

public class Customer extends User{
    private String fName;
    private String lName;
    private String phone;
    private String email;
    private Address address; // composite relationship .. The User class contains address class

    public Customer(String fName, String lName, String phone, String email, Address address,String userName,String password) throws AccountException {
        super(userName,password);
        if(!isValidEmail(email)) throw new AccountException(new WrongDataException());
        if(!isValidPhoneNumber(phone)) throw new WrongDataException();
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }


//    public void undo(CustomerState state){
//        setUserName(state.getUserName());
//    }

    private CustomerState createState(){
        return new CustomerState(this.getUserName());
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(!isValidPhoneNumber(phone)) throw new WrongDataException();
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws AccountException {
        if(!isValidEmail(email)) throw new AccountException(new WrongDataException());
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
