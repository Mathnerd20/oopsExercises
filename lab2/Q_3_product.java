package lab2;

import java.util.Scanner;

public class Q_3_product {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = input.nextInt();
		int pdt = 1, i = 1;
		while(i <= n)
		{
			pdt *= i;
			i++;
		}
		System.out.println("The product of first " + n + " natural numbers is " +pdt);
		input.close();
	}
}
