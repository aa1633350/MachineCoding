package SplitWise;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) throws InvalidSplitTypeException{

        User u1 = new User("1","Aditya", "abc@gmail", "123");
        User u2 = new User("2","Anand", "abc@gmail", "123");
        User u3 = new User("3","Satya", "abc@gmail", "123");
        User u4 = new User("4","Arpit", "abc@gmail", "123");

        // EQUAL split type
        ExpenseGroup eg1 = new ExpenseGroup();
        eg1.setGiver(u1);
        eg1.setAmount(1000.0);
        List<User> takers = new ArrayList<>();
        takers.add(u2);
        takers.add(u3);
        takers.add(u4);
        eg1.setTakers(takers);
        eg1.setSplitType("EQUAL");
        ManageExpenses manageExpenses = new ManageExpenses(eg1);
        manageExpenses.updateBalancesOfUser();
    }
}
