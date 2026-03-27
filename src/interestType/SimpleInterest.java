package interestType;

public class SimpleInterest implements InterestType{
    private double rate;
    public SimpleInterest(double rate){
        this.rate=rate;
    }
    public double calculateInterest(double balance){
        return balance*rate;
    }
}
