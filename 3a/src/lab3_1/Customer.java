package lab3_1;

public class Customer {
   private  String firstName , lastName;
   private BankAccount account;

    Customer customer1 = new Customer("John", "BLACK");


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
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
}
