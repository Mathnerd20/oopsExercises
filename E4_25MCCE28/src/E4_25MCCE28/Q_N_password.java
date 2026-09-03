package E4_25MCCE28;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Q_N_password {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = input.nextLine();
		if(password.length() < 8 || password.length() > 15) {
			System.out.println("Password length must be between 8 and 15");
			return;
		}
		Pattern pattern = Pattern.compile("^[a-z[A-Z]]");
		Matcher checker = pattern.matcher(password);
		if(!checker.find()) {
			System.out.println("Password must start with letter ");
			return;
		}

		pattern = Pattern.compile("\\d+");
		checker = pattern.matcher(password);
		if(!checker.find()) {
			System.out.println("Password must contain a number ");
			return;
		}

		pattern = Pattern.compile("[A-Z]");
		checker = pattern.matcher(password);
		if(!checker.find()) {
			System.out.println("Password must contain a captial letter");
			return;
		}

		pattern = Pattern.compile("[a-z]");
		checker = pattern.matcher(password);
		if(!checker.find()) {
			System.out.println("Password must contain a small letter");
			return;
		}
		System.out.println("valid password");
	}
}
