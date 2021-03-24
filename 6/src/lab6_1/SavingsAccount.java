package lab6_1;

public class SavingAccount extends BankAccount{

    private double interestRate;

    public SavingAccount(double interestRate){
        super();
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        this.balance += interestRate*balance;
    }

    public String toString(){
        return super.toString() + "account ... " + interestRate;
    }
}
