package Exercise5.employeeClasses;

public class employee {
	int id;
	String name;
	double salary;
	double dailyWages;
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

	public void display() {
		System.out.printf("Employee id : %d \n Employee name: %s \n Employee Salary: %lf \n", id, name, salary);
	}
}
