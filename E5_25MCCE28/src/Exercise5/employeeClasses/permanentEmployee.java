package Exercise5.employeeClasses;

public class permanentEmployee extends employee {
	double epf;
	public permanentEmployee() {
		super();
        epf = 0;
	}
	public permanentEmployee(int id, String name, double salary, double epf){
		super(id, name, salary);
        this.epf = epf;
	}
	public permanentEmployee(employee a, double epf) {
		super(a);
        this.epf = epf;
	}

	//methods
	public double calculateEPF() {
		return (this.salary * epf)/100;
	}
	public void display() {
		System.out.printf("Permanent Employee id : %d \nEmployee name: %s \nEmployee Salary: %f \nEmployee epf amount %f \n", id, name, salary, this.calculateEPF());
	}
}
