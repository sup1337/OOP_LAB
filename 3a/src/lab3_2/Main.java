package lab3_2;

import lab3_1.BankAccount;

public class Main {
    public static void main(String[] Args){

        Customer cust1 = new Customer("Zoltan","Erika");
        BankAccount acc1 = new BankAccount ("Otp");
        BankAccount acc2 = new BankAccount("Laci bank");
        cust1.addAccount(acc1);
        cust1.addAccount(acc2);
        System.out.println(cust1);

    }
}
