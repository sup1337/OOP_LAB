package lab3_1;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Jhon","Black");
        BankAccount bankAccount1= new BankAccount("OTP001");
        customer1.setAccount(bankAccount1);
        bankAccount1.deposit(1000);
        System.out.println(customer1);

        Customer customer2= new Customer("Marry","White");
        BankAccount bankAccount2= new BankAccount("OTP002");
        customer2.setAccount(bankAccount2);
        bankAccount2.deposit(100);
        //customer2.closeAccount();
        System.out.println(customer2);

        Customer customer3 = new Customer("MarryJhon" , "Black");
        customer3.setAccount(bankAccount2);
        System.out.println(customer3);


    }
}
