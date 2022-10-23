package Memento;

public class CustomerState {
    private final String userName;
    public CustomerState(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
}
