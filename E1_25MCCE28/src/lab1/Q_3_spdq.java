package lab1;

import java.util.Scanner;
public class Q_3_spdq {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = number.nextInt();
		System.out.println("Enter number b:");
		int b = number.nextInt();
		System.out.println("The sum a + b is " + (a+b));
		System.out.println("The product a * b is " + (a*b));
		System.out.println("The difference a - b is " + (a-b));
		if(b == 0)
		{
			System.out.println("Division not possible");
			number.close();
			return;
		}
		System.out.println("The quotient a / b is " + (a/b));
		number.close();
	}
}
