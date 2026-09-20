package testClasses;
import absEmployee.FullTimeEmpolyee;
import absEmployee.PartTimeEmployee;
import absEmployee.employee;
public class Q_2_employee {
	public static void main(String[] args) {
		employee a = new FullTimeEmpolyee(4000);
		employee b = new PartTimeEmployee(100);
		System.out.println("The full time employee's pay after 2 months is " + a.computePay(2));
		System.out.println(a.toString());
		System.out.println("The part time employee's pay after 100 hours is " + b.computePay(100));
		System.out.println(b.toString());
	}
}
