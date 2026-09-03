package lab1;

import java.util.Scanner;
public class Q_7_compare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("Enter A:");
		a = input.nextInt();
		System.out.println("Enter B:");
		b = input.nextInt();
		System.out.println("Enter C:");
		c = input.nextInt();
		System.out.println("Enter D:");
		d = input.nextInt();
		if(d == 0) {
			System.out.println("Error");
			input.close();
			return;
		}
		if((a*b) < (c/d))
			System.out.println("Yes");
		else
			System.out.println("No");
		input.close();
	}
}
