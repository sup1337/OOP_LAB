package lab3_1;

import java.util.ArrayList;

public class Customer {
   private  String firstName , lastName;
   private BankAccount account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BankAccount getAccount() {
        return account;
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
    public void closeAccount(){
       account=null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " " + firstName + '\'' +
                ", " + lastName + '\'' +
                "," + account+
                '}';
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
}
