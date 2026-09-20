package Exercise5.bankClasses;
import java.util.Scanner;

public class checking extends Account{
   final int transactionLimit = 3;
   int transactions;
   final int fee = 2;

   // constructors
   public checking(){
       super();
       this.transactions = 0;
   }
   public checking(String name, String surname, String address, long phone, long balance){
       super(name, surname, address, phone, balance);
       this.transactions = 0;
	}
   public checking(Account a){
       super(a);
       this.transactions = 0;
   }

   //methods
   public double Credit(double amount){
       this.transactions++;
       return super.Credit(amount);
   }

   public double Withdraw(double amount){
       if(this.transactions >= 3){
           if(this.balance < amount + fee){
               System.out.println("Withdraw unsuccessfull in sufficient balance");
               return -1;
           }
           System.out.println("Transaction limit exceeded, proceed with extra fees (2Rs)? [yes = 1/no = 0]");
           var in = new Scanner(System.in);
           int ok = in.nextInt();
           if(ok == 1){
               super.Withdraw(amount);
               deduct(fee);
               in.close();
               this.transactions++;
               return balance;
           }
           else{
               System.out.println("Withdraw unsuccessfull");
               in.close();
               return -1;
           }
       }
       this.transactions++;
       return super.Withdraw(amount);
   }

   public void deduct(double fee){
       this.balance -= fee;
   }

   public void displayBalance(){
	    System.out.println("Balanace of " + this.Name + " " + this.Surname + "'s checking account is " + this.balance + " with no.of transactions done " + this.transactions);
	}
}
