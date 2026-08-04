package lab2;

import java.util.Scanner;

public class Q_8_sumarray {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers in a sequence: ");
		int[] array = new int[10];
		for(int i = 0; i < 10; i ++)
		{
			array[i] = input.nextInt();
		}
		
		System.out.println("The 2nd element is: " + array[1] +"\nThe 8th element is: " + array[7]);
		System.out.println("Sum of 4th and 6th elements: " + (array[3] + array[5]));
		input.close();
	}
}
