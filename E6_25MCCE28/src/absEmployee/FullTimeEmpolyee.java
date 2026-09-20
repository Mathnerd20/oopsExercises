package absEmployee;

public class FullTimeEmpolyee extends employee{
	protected double monthlyRate;
	public FullTimeEmpolyee() {
		this.monthlyRate = 0;
		this.yearToDateEarnings = 0;
	}
	public FullTimeEmpolyee(double x) {
		this.monthlyRate = x;
		this.yearToDateEarnings = 0;
	}
	public double computePay(int months) { //number of days worked in typical month
//		double salary =  (monthlyRate/30) * days;
		double salary =  monthlyRate * months;
		this.yearToDateEarnings += salary;
		return salary;
	}
	public String toString(){
		return "Full time employee monthly rate " + this.monthlyRate + " and year to date earnings is " + this.yearToDateEarnings;
	}
}
