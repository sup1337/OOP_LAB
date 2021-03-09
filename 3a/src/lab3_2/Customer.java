package lab3_2;

import lab3_1.BankAccount;

import java.util.ArrayList;

public class Customer {
   private  String firstName , lastName;
   private BankAccount account;
   private int numAccounts;
   public static final int MAX_ACCOUNTS = 10;

    ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BankAccount getAccount(String accNumber) {
        for(BankAccount i : accounts){
                if((i.getAccountNumber()).equals(accNumber)){
                    return i;
                }
        }
        return null;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void closeAccount(String accNumber){
       for(BankAccount acc : accounts){
           if(acc.getAccountNumber().equals(accNumber)){
               accounts.remove(acc);
               numAccounts--;
           }
       }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(BankAccount acc : accounts){
            result.append( "\t" + acc.toString() +"\n");
        }
        return result.toString();
    }
    public void addAccount(BankAccount account) {
        if(accounts.size()<MAX_ACCOUNTS)
            accounts.add(account);
            numAccounts++;

    }
}
