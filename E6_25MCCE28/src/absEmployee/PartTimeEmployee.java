package absEmployee;
public class PartTimeEmployee extends employee{
	protected double hourlyRate;
	public PartTimeEmployee() {
		this.hourlyRate = 0;
		this.yearToDateEarnings = 0;
	}
	public PartTimeEmployee(double k) {
		this.hourlyRate = k;
		this.yearToDateEarnings = 0;
	}
	public double computePay(int hours) { //number of hours worked
		double salary = hourlyRate * hours;
		this.yearToDateEarnings += salary;
		return salary;
	}
	public String toString(){
		return "Part time employee monthly rate " + this.hourlyRate + " and year to date earnings is " + this.yearToDateEarnings;
	}
}
