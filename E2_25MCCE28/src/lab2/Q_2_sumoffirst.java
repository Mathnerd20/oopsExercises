package lab2;

import java.util.Scanner;

public class Q_2_sumoffirst {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			sum += i;
		}
		System.out.println("The sum of first " + n + " natural numbers is " + sum);
		input.close();
	}
}
