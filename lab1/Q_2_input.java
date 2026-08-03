package lab1;

import java.util.Scanner;
public class Q_2_input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n1 = input.nextInt(); 
		System.out.println("Entered number is: " + n1);
		input.close();
	}
}
