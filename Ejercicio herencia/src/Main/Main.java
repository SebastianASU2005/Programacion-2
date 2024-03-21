package Main;

import Classes.CurrentAccount;
import Classes.SavingAccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount s1=new SavingAccount(10000,30000);
        CurrentAccount c1=new CurrentAccount(10000,30000);
        System.out.println("Pruebas cuenta de ahorro ");
        s1.consign(3000);
        System.out.println(s1);
        s1.withdraw(1000);
        s1.withdraw(1000);
        s1.withdraw(1000);
        s1.withdraw(1000);
        System.out.println(s1);
        s1.consign(10000);
        System.out.println("Pruebas cuenta corriente");
        c1.consign(1000);
        System.out.println(c1);
        c1.withdraw(12000);
        System.out.println(c1);
        c1.consign(2000);
        System.out.println(c1);
        c1.consign(11000);
        System.out.println(c1);


    }
}