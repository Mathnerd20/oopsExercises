package lab1;

import java.util.Scanner;

public class Q_4_large {
public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = number.nextInt();
		System.out.println("Enter number b:");
		int b = number.nextInt();
		if(a > b)
			System.out.println("Largest number is " + a);
		else
			System.out.println("Largest number is " + b);
		number.close();
	}
}
