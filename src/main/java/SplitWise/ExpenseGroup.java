package SplitWise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseGroup {

    private User giver;
    double amount;
    private List<User> takers;
    private SplitType splitType;
    private Map<User,Double> exactSplitMap = new HashMap<>();
    private Map<User,Double> percentSplitMap = new HashMap<>();

    public User getGiver() {
        return giver;
    }

    public void setGiver(User giver) {
        this.giver = giver;
    }

    public List<User> getTakers() {
        return takers;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setSplitType(String splitType) throws InvalidSplitTypeException {
        if(splitType.equals("EQUAL")) {
            this.splitType = new EqualSplitType(this);
        } else if(splitType.equals("EXACT")) {
            this.splitType = new ExactSplitType();
        } else if(splitType.equals("PERCENT")) {
            this.splitType = new PercentSplitType();
        } else {
            throw new InvalidSplitTypeException();
        }
    }

    public void setTakers(List<User> takers) {
        this.takers = takers;
    }

    public Map<User, Double> getExactSplitMap() {
        return exactSplitMap;
    }

    public void setExactSplitMap(Map<User, Double> exactSplitMap) {
        this.exactSplitMap = exactSplitMap;
    }

    public Map<User, Double> getPercentSplitMap() {
        return percentSplitMap;
    }

    public void setPercentSplitMap(Map<User, Double> percentSplitMap) {
        this.percentSplitMap = percentSplitMap;
    }

    public int numberOfTakers() {
        return takers.size();
    }
}
