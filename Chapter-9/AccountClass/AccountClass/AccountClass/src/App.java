public class App {
    public static void main(String[] args) {
        
        Account acc1 = new Account(1122, 20000);
        acc1.SetAnnualInterestRate(4.5);

        acc1.withdraw(2500);
        acc1.deposit(3000);

        System.out.println("Account 1's balance is " + acc1.GetBalance() 
        + "\nAccount 1's monthly interest is " + acc1.getMonthlyInterest() 
        + "\nAccount 1 was created on " + acc1.getDateCreated().toString());

    }
}
