package bankAccountType;


import bankAccount.BankAccount;
import customer.Customer;
import exception.InvalidBalanceException;

public class SavingsAccount extends BankAccount {
    public static final double MIN_BALANCE=5000;
    public static final double MaximumWithDrawalPerWeek=20000;
    public static final double withDrawalLimitPerMonth=10;

    public SavingsAccount(double balance, Customer customer,String accountNo) throws InvalidBalanceException{
        super(accountNo,balance,customer);
    }

    @Override
    public double calculateInterest(){
        return balance*INTEREST_RATE;
    }


    @Override
    public void validateMinimumBalance() throws InvalidBalanceException {
        if(balance<MIN_BALANCE){
            throw new InvalidBalanceException("Amount is much less !!");
        }
    }
}
