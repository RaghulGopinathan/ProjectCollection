/*
ExpenseTracker
- ArrayList<Expense>
- addExpense()
- viewExpenses()
- getTotal()
 */

import java.util.ArrayList;

public class ExpenseTracker{


    ArrayList<Expense> arrList = new ArrayList<Expense>();

    public void addExpense(double amount, String category, String description){
        Expense expenseObj = new Expense();
        expenseObj.setAmount(amount);
        expenseObj.setCategory(category);
        expenseObj.setDescription(description);

        arrList.add(expenseObj);
    }

    public void viewExpense()
    {
        for (Expense x : arrList)
        {
            System.out.println("Amount: "+x.getAmount() +"Category: "+x.getCategory()+"Description: "+x.getDescription());
        }
    }
}
