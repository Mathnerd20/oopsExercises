package lab2;

import java.util.Scanner;
import java.math.*;

public class Q_1_summary {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x = 6;
		String coffee = "It's \"coffee\" time";
		if(++x > 4 && x++ <=10) System.out.println("Message: " + coffee);
		System.out.println(x);
		String hello = "hello";
		System.out.println(hello + " " + hello.length());
		System.out.println(hello.toUpperCase());
		String phrase = "Hello this is akshay";
		System.out.println("Index of Akshay: " + phrase.indexOf("akshay"));
		System.out.println("Character at 3th position of hello: " + hello.charAt(3));
		hello += " and " + x;
		System.out.println(hello + " ");
		x = (int)Math.pow(2, hello.length());
		System.out.println(x);
		String result = (x > 0) ? "X is positive" : "X is negative or zero";  
		System.out.println(result);
		String[] bool = {"Yes", "No"};
		for(String i: bool)
		{
			System.out.println(i);
		}
		int[][] unity = new int[3][3];
		for(int row[] : unity)
		{
			System.out.print("[");
			for(int i : row) System.out.print(1);
			System.out.println("]");
		}
		input.close();
	}
}
