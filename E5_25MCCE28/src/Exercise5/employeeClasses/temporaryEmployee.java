package Exercise5.employeeClasses;

public class temporaryEmployee extends employee{
    int probationaryPeriod;

    public temporaryEmployee(){
        super();
        this.probationaryPeriod = 0;
    }

	public temporaryEmployee(int id, String name, double salary, int probationaryPeriod){
		super(id, name, salary);
        this.probationaryPeriod = probationaryPeriod;
	}

    public temporaryEmployee(employee a, int probationaryPeriod){
        super(a);
        this.probationaryPeriod = probationaryPeriod;
    }
    /* measure the period between joining(take it from input) and today's date in hours or no.of days,
     * progress = period/probationary period */
}
