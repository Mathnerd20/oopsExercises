package Exercise5.employeeClasses;

public class employee {
    //declarations
	protected int id;
	protected String name;
	protected double salary;

	//setters and getters
	public int getID(){
    	return id;
	}
	public double getSalary(){
    	return salary;
	}
	// public double getdailyWages(){
 //    	return dailyWages;
	// }
	public String getName(){
    	return name;
	}
	public void setID(int id){
    	this.id = id;
	}
	public void setSalary(double salary){
    	this.salary = salary;
	}
	// public void setdailyWages(double dailyWages){
 //    	this.dailyWages =  dailyWages;
	// }
	public void setName(String name){
    	this.name = name;
	}

	//constructors
	public employee(){
		this.id = 0;
		this.name = "NULL";
		this.salary = 0;
	}
	public employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public employee(employee a){
		this.id = a.id;
		this.name = a.name;
		this.salary = a.salary;
	}

	//methods
	public void display() {
		System.out.printf(" Employee id : %d \n Employee name: %s \n Employee Salary: %f \n", id, name, salary);
	}
}
