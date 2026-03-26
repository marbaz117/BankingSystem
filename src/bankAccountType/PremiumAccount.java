package bankAccountType;

import bankAccount.BankAccount;
import customer.Customer;
import exception.InvalidBalanceException;

public class PremiumAccount extends BankAccount {
    private static final double MIN_BALANCE=100000;
    private static final double INTEREST_RATE=0.09;
    private int loyalPoints;
    public PremiumAccount(String accountNo, double balance, Customer customer)throws InvalidBalanceException{
        super(accountNo,balance,customer);
        this.loyalPoints=10;
    }
    public double calculateInterest(){
        return balance*INTEREST_RATE;
    }
    public void validateMinimumBalance() throws InvalidBalanceException{
        if(balance<MIN_BALANCE) {
            throw new InvalidBalanceException("Less than Minimum Balance!!");
        }
    }
}
