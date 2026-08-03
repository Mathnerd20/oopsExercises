package lab1;

import java.util.Scanner;

public class Q_9_pin {
	public static void main(String[] args) {
		final int a = 1234; 
		final int b = 4321; 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 4 digit pin: ");
			int n = input.nextInt();
			if(n > 9999 || n < 1000)
			{
				System.out.println("Please enter 4 digit number");
				input.close();
				return;
			}
			if(n == a || n == b)
				System.out.println("Failure");
			else
				System.out.println("Success");
			input.close();
		}
}
