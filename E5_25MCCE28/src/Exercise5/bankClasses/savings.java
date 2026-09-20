package Exercise5.bankClasses;

public class savings extends Account{
   double interestRate;

   // constructors
   public savings(){
       super();
       this.interestRate = 0;
   }
   public savings(String name, String surname, String address, long phone, long balance, double interest){
       super(name, surname, address, phone, balance);
       if(interest > 0) this.interestRate = interest;
       else this.interestRate = 0; //if user inputs interest rate negative defaults to 0
	}
   public savings(Account a, double interest){
       super(a);
       if(interest > 0) this.interestRate = interest;
       else this.interestRate = 0; //if user inputs interest rate negative defaults to 0
   }
   //methods
   public double addInterest(){
       balance += (interestRate*balance)/100;
       return balance;
   }

   public void displayBalance(){
	    System.out.println("Balanace of " + this.Name + " " + this.Surname + "'s savings account is " + this.balance + " with interest rate " + this.interestRate);
	}
}
