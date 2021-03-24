package lab6_1;

import java.util.ArrayList;

public class Customer {
    //Attributes
    private static int numCustomers=0;
    private final int id;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    //Constructors

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numCustomers++;
        this.id=numCustomers;
    }

    public int getId(){
        return id;
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    public void addAccount(BankAccount account) {
        if (account == null) {
            return;
        }
        accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Nem letezik ez az account");
        return null;
    }

    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> res = new ArrayList<>();
        for(BankAccount account: accounts){
            res.add(account.getAccountNumber());
        }
        return res;
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

    public void closeAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                return;
            }
        }
        System.out.println("Ez a account mar nem letezik");
    }

    @Override
    public String toString() {
        StringBuffer allAccounts = new StringBuffer();
        allAccounts.append(firstName + " " + lastName + " " + "\n\t" + "accounts:\t");
        for (BankAccount account : accounts) {
            allAccounts.append(account.toString() + "\n\t\t\t\t");
        }
        return allAccounts.toString();
    }
}