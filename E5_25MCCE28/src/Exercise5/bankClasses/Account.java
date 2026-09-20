package Exercise5.bankClasses;
public class Account{
    //attributes
	String Name;
	String Surname;
	protected String Address;
	protected long phone;
	protected double balance;

	//constructors
	public Account(){
		this.Name = "NULL";
		this.Surname = "NULL";
		this.Address = "NULL";
		this.phone = 0;
		this.balance = 0;
	}
	public Account(String name, String surname, String address, long phone, double balance){
		this.Name = name;
		this.Surname = surname;
		this.Address = address;
		if(phone > 0) this.phone = phone;
        else this.phone = 0; //if user inputs negative phone number defaults to 0
		if(balance > 0) this.balance = balance;
        else this.balance = 0; //if user inputs negative balance defaults to 0
	}
	public Account(Account b){
	    this.Name = b.Name;
	    this.Surname = b.Surname;
	    this.Address = b.getAddress();
	    this.phone = b.getPhone();
	    this.balance = b.getBalance();
	}

	//methods
	public double Credit(double amount)
	{
		if(amount < 0)
		{
			System.out.println("Can't credit -ve amount");
			return -1;
		}
		this.balance += amount;
		System.out.println(amount + "Rs credited to " + this.Name + "'s account");
		return this.balance;
	}

	public double Withdraw(double amount)
	{
		if(this.balance < 0 || amount > this.balance)
		{
			System.out.println("Insufficient Bank balance");
			return -1;
		}
		if(amount < 0)
		{
			System.out.println("Can't withdraw -ve amount");
			return -1;
		}
		this.balance -= amount;
		System.out.println(amount + "Rs withdrawed from " + this.Name + "'s account");
		return this.balance;
	}

	public void displayBalance(){
	    System.out.println("Balanace of " + this.Name + " " + this.Surname + "'s account is " + this.balance);
	}

	public void transfer(Account b, double amount){
		if(this.Withdraw(amount) == -1){
		    System.out.println("Transfer Failed!");
			return;
		}
		b.Credit(amount);
	}

	//getters and setters
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
	public double getBalance()
	{
		return balance;
	}
	public void setName(String name)
	{
		 this.Name = name;
	}
	public void setSurname(String Surname)
	{
		this.Surname = Surname;
	}
	public void setAddress(String address)
	{
		this.Address = address;
	}
	public void setPhone(long phone)
	{
		this.phone = phone;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
}
