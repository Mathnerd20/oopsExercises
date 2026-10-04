package testing;
import employeeClasses.employee;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Q_2_client{
	//Provide input like this [<Employee Name>.<ID>.<Salary>]
	public static void main(String[] args){
		employee[] clients = new employee[3];
		Pattern pattern = Pattern.compile("\\[([a-zA-Z]+),\\s*(\\d+),\\s*(\\d+)\\]"); //using regex capture groups
		// using \\ to escape from regex string and also include optional whitespace after comma.
		if(args.length != 3) {
			System.out.println("Incorrect Arguments provided");
			return;
		}
		for(int i = 0; i < args.length; i++) {
			Matcher checker = pattern.matcher(args[i]);
			if(checker.matches()) {
				clients[i] = new employee(Integer.parseInt(checker.group(2)), checker.group(1), Double.parseDouble(checker.group(3)));
			}
			else {
				System.out.println("Improper input! employee " + i + " not read properly");
			}
		}
		for(Object i : clients) {
			System.out.println(i.toString());
		}
		System.out.println(clients[2].equals(clients[1]));
		clients[2] = null;
		System.gc();
		for(int i = 0; i < Integer.MAX_VALUE; i++); //looping to keep running program for a while
		System.out.println("The program has ended");
	}
}