package bankAccount;

import customer.Customer;
import exception.InvalidAccountStatusException;
import exception.InvalidBalanceException;
import java.util.Date;

public abstract class BankAccount{
    protected String accountNumber;
    protected double balance;
    protected boolean isActive;
    protected Date openDate;
    protected Customer customer;
    public static double INTEREST_RATE;
    public BankAccount(String accountNumber, double balance, Customer customer) throws InvalidBalanceException{
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isActive = true;
        this.openDate = new Date();
        this.customer = customer;
        validateMinimumBalance();
    }

    public void depositMoney(double money){
        this.balance+=money;
        System.out.println("Account: " + accountNumber +
                " | Balance: " + balance);
    }

    public static void setInterestRate(double interestRate){
        INTEREST_RATE=interestRate;
    }

    public void withDrawMoney(double money) throws InvalidBalanceException{
        try{
            balance-=money;
            validateMinimumBalance();
        }
        catch(InvalidBalanceException e){
            balance+=money;
            throw new InvalidBalanceException("Can't WithDraw Low Balance");
        }
    }

    public abstract double calculateInterest();

    public abstract void validateMinimumBalance() throws InvalidBalanceException;

    public void applyInterest() throws InvalidAccountStatusException {
        if(!isActive){
            throw new InvalidAccountStatusException("This Account is not active !! ");
        }
        double interest=calculateInterest();
        balance+=interest;
        System.out.println("Account: " + accountNumber +
                " | Opening Balance: " + (balance - interest) +
                " | Interest: " + interest +
                " | Closing Balance: " + balance);
    }

    public String toString() {
        return "Account No: " + accountNumber +
                ", Customer: " + customer.getName() +
                ", Balance: " + balance +
                ", Status: " + (isActive ? "Active" : "Inactive");
    }

}
