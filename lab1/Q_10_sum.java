package lab1;

import java.util.Scanner;

public class Q_10_sum {
	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter number < 100: ");
			int n = input.nextInt();
			if(n > 100)
			{
				System.out.println("Number > 100 entered \n" + "Sum is: " + sum);
				input.close();
				return;
			}
			if(sum > 100)
			{
				System.out.println("Sum exceeded 100, \n" + "Sum is: " + sum);
				input.close();
				return;
			}
			sum += n;
		}
		System.out.println("Sum is: " + sum);
		input.close();
	}
}
