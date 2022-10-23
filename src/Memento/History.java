package Memento;

import java.util.Stack;

public class History {
    private Stack<CustomerState> history = new Stack<>(); // composite relationship

    public void push(CustomerState content){
        this.history.push(content);
    }
    public CustomerState pop(){
        if(history.isEmpty()) return null;
        return history.pop();
    }
}
