package Exercise5.test;

import Exercise5.bankClasses.*;

public class Q_3_bank{
    public static void main(String[] args){
        var a = new Account("Apple", "Banana", "Carrot", 10110, 12);
        var b = new Account("Superman", "Batman", "Spiderman", 10101, 10);
        a.displayBalance();
        b.displayBalance();

        System.out.println("\nTransfering 13Rs from a to b");
        a.transfer(b, 13);
        a.displayBalance();
        b.displayBalance();
        System.out.println("\nTransfering 12Rs from a to b");
        a.transfer(b, 12);
        a.displayBalance();
        b.displayBalance();
        System.out.println("\nSelf Transfering 9Rs from b to a");
        b.transfer(a, 9);
        b.displayBalance();
        a.displayBalance();

        System.out.println("\nConverting a into savings account with interest rate 25%");
        var c = new savings(a, 25);
        c.displayBalance();
        System.out.println("balance after adding interest on " + c.getName() + "'s savingss account: " + c.addInterest() );

        System.out.println("\nConverting b into checking account");
        var d = new checking(b);
        d.displayBalance();

        System.out.println("\n3 sample transactions (3 is transaction limit)");
        d.Withdraw(1);
        d.Credit(3);
        d.Withdraw(1);
        d.displayBalance();
        c.displayBalance();
        System.out.println("\nTransfering 5Rs to savings account of "+ c.getName()+ " " + c.getSurname());
        d.transfer(c, 5);
        c.displayBalance();
        d.displayBalance();
    }
}
