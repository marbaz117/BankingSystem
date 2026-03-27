package bankAccountType;

import bankAccount.BankAccount;
import customer.Customer;
import exception.InvalidBalanceException;

public class PremiumAccount extends BankAccount {
    private static final double MIN_BALANCE=100000;
    private int loyalPoints;
    public PremiumAccount(String accountNo, double balance, Customer customer)throws InvalidBalanceException{
        super(accountNo,balance,customer);
        this.loyalPoints=10;
    }
    public double calculateInterest(){
        return balance*INTEREST_RATE;
    }

    public void depositMoney(double money){
        balance+=money;
        if(money>=10000&&balance>=150000){
            loyalPoints+=10;
        }
        System.out.println("Account: " + accountNumber +
                " | Balance: " + balance);
    }

    public void validateMinimumBalance() throws InvalidBalanceException{
        if(balance<MIN_BALANCE) {
            throw new InvalidBalanceException("Less than Minimum Balance!!");
        }
    }
}
