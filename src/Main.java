import Entities.Address;
import Entities.Customer;
import Entities.User;
import Exceptions.AccountException;
import Generics.GenericList;

public class Main {
    public static void main(String[] args) {
        Address ad1 = new Address("NY","11105","ad1","ad21");
        Address ad2 = new Address("PA","11106","ad2","ad22");
        Address ad3 = new Address("CL","11107","ad3","ad23");

//        try {
//            Customer c1 = new Customer("Ahamed","M","123456","asdasdasd",ad1,"hesh@am","123");
//        }catch (AccountException e){
//            e.printStackTrace();
//        }
//
//        try {
//            User user1 = new User("Hesham","Password");
//        }
//        catch (AccountException e){
//            e.printStackTrace();
//        }


        GenericList<Address> addresses = new GenericList<>();
        addresses.add(ad1);
        addresses.add(ad2);
        addresses.add(ad3);

        for(var address : addresses){
            System.out.println(address);
        }

    }
}