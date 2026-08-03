package lab1;

import java.util.Scanner;
public class Q_5_max5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max;
		System.out.println("Enter 1st number: ");
		max = input.nextInt();
		int min = max;
		for(int i = 1; i <= 4; i++)
		{
			System.out.println("Enter number " + (i+1) + ": ");
			int n = input.nextInt();
			if(n > max)
				max = n;
			if(n < min)
				min = n;
		}
		System.out.println("The max number is "+ max + "\n The minimum number is "+ min);
		input.close();
	}
}
