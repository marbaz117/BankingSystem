import java.util.Date;

public class BankAccount {
    private String accountNumber;
    private long balance;
    private AccountStatus accountStatus;
    private Customer customer;
    private Date openedData;
    private AccountType accountType;
    private int minimumBalance;

    public BankAccount(String accountNumber, long balance, AccountStatus accountStatus, Customer customer,
                       Date openedData, AccountType accountType, int minimumBalance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountStatus = accountStatus;
        this.openedData = openedData;
        this.accountType = accountType;
        this.minimumBalance = minimumBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Customer getCustomer() {
        return customer;
    }


    public Date getOpenedData() {
        return openedData;
    }

    public void setOpenedData(Date openedData) {
        this.openedData = openedData;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

}
