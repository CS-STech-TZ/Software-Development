import java.util.Date;

public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = null;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double initialBalance) {
        this.id = id;
        balance = initialBalance;
        dateCreated = new Date();
    }

    public int GetId() {
        return id;
    }

    public void SetId(int newId) {
        id = newId;
    }

    public double GetBalance() {
        return balance;
    }

    public void SetBalance(double newBalance) {
        balance = newBalance;
    }

    public double GetAnnualInterestRate() {
        return annualInterestRate;
    }

    public void SetAnnualInterestRate(double interestRate) {
        annualInterestRate = interestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return ((annualInterestRate / 100) / 12) * balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

}