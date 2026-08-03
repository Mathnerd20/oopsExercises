package lab1;

import java.util.Scanner;

public class Q_8_frequency {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int plus, minus, zero;
		plus = minus = zero = 0;
        System.out.println("Enter 10 numbers: ");
		for(int i = 1; i <= 10; i++)
		{
			int n = input.nextInt();
			if(n > 0)
				plus++;
			else if(n < 0)
				minus++;
			else
				zero++;
		}
		System.out.println("Number of positive: " + plus + "\n Number of negative: " + minus +"\n Number of zeros: " + zero);
		input.close();
	}
}
