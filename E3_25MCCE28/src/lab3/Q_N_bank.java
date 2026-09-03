package lab3;

import java.util.Scanner;

class details{
	//attributes
	String Name;
	String Surname;
	private String Address;
	private long phone;
	private long balance;

	details(String name, String surname, String address, long phone, long balance){
		Name = name;
		Surname = surname;
		Address = address;
		this.phone = phone;
		this.balance = balance;
	}

	//getters
	public String getName()
	{
		return Name;
	}

	public String getSurname()
	{
		return Surname;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public long getPhone()
	{
		return phone;
	}
	
	public long getBalance()
	{
		return balance;
	}
	//transactions
	public long Credit(int amount)
	{
		if(amount < 0)
		{
			System.out.println("Can't credit -ve amount");
		}
		balance += amount;
		return balance;
	}
	public long Withdraw(int amount)
	{
		if(balance < 0 || amount > balance)
		{
			System.out.println("Insufficient Bank balance");
			return -1;
		}
		if(amount < 0)
		{
			System.out.println("Can't withdraw -ve amount");
			return -1;
		}
		balance -= amount;
		return balance;
	}
}

public class Q_N_bank {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int bal;
		System.out.println("Enter balance");
		bal = input.nextInt();
		details donkey = new details("Haneesh", "Kumar", "LB Nagar", 1729314159, bal);
		System.out.println("Person details: ");
		System.out.println(donkey.getName());
		System.out.println(donkey.getSurname());
		System.out.println(donkey.getAddress());
		System.out.println(donkey.getPhone());
		System.out.println(donkey.getBalance());
		int proceed = 10;
		while(proceed != 0) {
			System.out.println("Enter 1 to withdraw, 2 to credit, 3 to view balance, 0 to exit");
			proceed = input.nextInt();
			int amt;
			switch(proceed) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amt = input.nextInt();
				donkey.Withdraw(amt);
				break;
			case 2:
				System.out.println("Enter amount to credit");
				amt = input.nextInt();
				donkey.Credit(amt);
				break;
			case 3:
				System.out.println("Balance is " + donkey.getBalance());
				break;
			case 0:
				break;
			default:
				System.out.println("Enter valid option! ");
			}
		}
		input.close();
		return;
	}
}
