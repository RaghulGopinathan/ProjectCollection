public class Main{
    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        System.out.println("Select any option below:\n"+"1. Add Expense"+"\n2. View Expense"+"\n3. Show Total"+"\n4. Exit");
        expenseTracker.addExpense(1000,"Commute","Bus travel recent");
        expenseTracker.viewExpense();
    }
}