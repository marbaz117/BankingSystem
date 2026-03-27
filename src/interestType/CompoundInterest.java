package interestType;

public class CompoundInterest implements InterestType{

    private int time;
    private double rate;
    public CompoundInterest(int time,double rate){
        this.time=time;
        this.rate=rate;
    }
    public double calculateInterest(double balance){
        return balance*Math.pow((1+rate),time)-balance;
    }


}
