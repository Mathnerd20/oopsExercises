package employeeClasses;

public class employee {
	//declarations
	private int id;
	private String name;
	private double salary;

	//setters and getters
	public int getID(){
		return id;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public void setID(int id){
		this.id = id;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
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
		this.id = a.getID();
		this.name = a.getName();
		this.salary = a.getSalary();
	}

	//methods
	public String toString() {
		return "Employee ID: " + this.id + "\nEmployee name: " + this.name + "\nEmployee Salary: " + this.salary + "\n";
	}
	public void finalize() {
		System.out.printf("Employee %d is being garbage collected!\n", this.id);
//		System.out.printf("%d getting collected", this.id);
	}
	public boolean equals(Object a) {
		if(a instanceof employee) {
			employee k = (employee) a;
			if(this.id == k.getID() && this.name.equals(k.name) && this.salary == k.getSalary()) return true;
		}
		return false;
	}
}
