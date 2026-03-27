package bankAccountType;

import bankAccount.BankAccount;
import customer.Customer;
import exception.InvalidBalanceException;

public class CurrentAccount extends BankAccount {
    private double overDraftLimit;
    public CurrentAccount(String accNo, double balance, Customer customer,double overDraftLimit) throws InvalidBalanceException{
        super(accNo,balance,customer);
        this.overDraftLimit=overDraftLimit;
    }

    public double calculateInterest() {
        return INTEREST_RATE*balance;
    }


    public void validateMinimumBalance() throws InvalidBalanceException {
        if(balance<-overDraftLimit)
            throw new InvalidBalanceException("Not Having Minimum Balance!!");
    }
}
