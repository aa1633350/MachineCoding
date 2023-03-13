package SplitWise;

public class EqualSplitType implements SplitType {

    ExpenseGroup expenseGroup;

    public EqualSplitType(ExpenseGroup expenseGroup) {
        this.expenseGroup = expenseGroup;
    }

    @Override
    public double getUserAmount(User user) {

        double amount = expenseGroup.getAmount();
        return (amount/expenseGroup.numberOfTakers());
    }
}
