import address.Address;
import bankAccount.BankAccount;
import bankAccountType.CurrentAccount;
import bankAccountType.PremiumAccount;
import bankAccountType.SavingsAccount;
import customer.Customer;
import exception.InvalidAccountStatusException;
import exception.InvalidBalanceException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    List<BankAccount> bankAccounts=new ArrayList<>();
    try{
        Customer c1=new Customer(1,"rahul@gmail.com","100","rahul",
                "123",new Address("patna","800006","Bihar"));
        Customer c2=new Customer(2,"Raja@gmail.com","200","Raja",
                "1234",new Address("Manipur","200006","Delhi"));
        Customer c3=new Customer(3,"Raman@gmail.com","300","raman",
                "12345",new Address("UP","400006","UP"));
        bankAccounts.add(new SavingsAccount(10000, c1,"SA101"));
        bankAccounts.add(new CurrentAccount("CA101", 20000, c2,5000));
        bankAccounts.add(new PremiumAccount("PA101",150000,c3));
    }
    catch(InvalidBalanceException e){
        System.out.println(e.getMessage());
    }
    CurrentAccount.INTEREST_RATE=0.05;
    SavingsAccount.INTEREST_RATE=0.01;
    PremiumAccount.INTEREST_RATE=0.10;
    System.out.println("----------Interest Calculation------------");
    for(BankAccount bankAccount:bankAccounts){
        try{
            bankAccount.applyInterest();
            bankAccount.depositMoney(1000);

        }
        catch(InvalidAccountStatusException e){
            System.out.println(e.getMessage());
        }
    }
    for(BankAccount bankAccount:bankAccounts){
        try{
            bankAccount.withDrawMoney(200);
        } catch (InvalidBalanceException e) {
            throw new RuntimeException(e);
        }
    }


}
