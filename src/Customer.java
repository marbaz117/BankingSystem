import java.time.LocalDate;
import java.util.Date;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String aadharNumber;
    private static int count=1;
    private AccountType accountType;
    private LocalDate openDate;
    private AccountStatus accountStatus;

    public Customer(AccountType accountType,String name, String email, String address, String phone, String aadharNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.aadharNumber = aadharNumber;
        this.customerId=count++;
        this.accountType=accountType;
        this.openDate=LocalDate.now();
        this.accountStatus=AccountStatus.Active;

    }
}
