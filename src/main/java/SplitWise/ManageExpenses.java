package SplitWise;

public class ManageExpenses {

    ExpenseGroup expenseGroup;

    public ManageExpenses(ExpenseGroup expenseGroup) {
        this.expenseGroup = expenseGroup;
    }

    public void updateBalancesOfUser() {
        User giver = expenseGroup.getGiver();
        for(User taker : expenseGroup.getTakers()) {
            double amount = expenseGroup.getSplitType().getUserAmount(taker);
            // update taker
            if(giver != taker) {

                if(taker.balances.containsKey(giver)){
                    double prevAmount = taker.balances.get(giver);
                    taker.balances.put(giver,prevAmount+amount);
                } else {
                    taker.balances.put(giver,amount);
                }
            }

            // update giver
            if(giver.balances.containsKey(taker)) {
                double prevAmount = giver.balances.get(taker);
                giver.balances.put(taker,prevAmount+amount);
            } else {
                giver.balances.put(taker,amount);
            }
        }
    }
}
