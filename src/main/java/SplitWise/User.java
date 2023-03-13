package SplitWise;

import java.util.HashMap;
import java.util.Map;

public class User {

    String id;
    String name;
    String email;
    String phone;
    Map<User, Double> balances = new HashMap<>();

    public User(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<User, Double> getBalances() {
        return balances;
    }

    public void setBalances(Map<User, Double> balances) {
        this.balances = balances;
    }
}
