package Exercise5.employeeClasses;

public class temporaryEmployee extends employee{
    int probationaryPeriod;
    double dailyWages;

    //constructors
    public temporaryEmployee(){
        super();
        this.probationaryPeriod = 0;
    }
	public temporaryEmployee(int id, String name, double salary, int probationaryPeriod, double dailyWage){
		super(id, name, salary);
        this.probationaryPeriod = probationaryPeriod;
        this.dailyWages = dailyWage;
	}
    public temporaryEmployee(employee a, int probationaryPeriod, double dailyWages){
        super(a);
        this.probationaryPeriod = probationaryPeriod;
        this.dailyWages = dailyWages;
    }

    //methods
    public void display() {
        System.out.printf("Temporary Employee id : %d \nEmployee name: %s \nEmployee Salary: %f \nProbationary period: %d\n", id, name, salary, probationaryPeriod);
	}

	public int viewProgress(int days){  //here days is no.of days since he joined
	    int progress = days/this.probationaryPeriod;
	    return progress;
	}

	public double monthSalary(int days){
	    double sal = days * this.dailyWages;
		return sal;
	}
}
