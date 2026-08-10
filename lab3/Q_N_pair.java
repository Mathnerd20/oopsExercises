package lab3;

import java.util.Scanner;
class pair{
	int a;
	int b;
	pair(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public boolean coprime()
	{
		for(int i = 2; i < Math.min(a, b); i++)
			if(a % i ==0 && b % i ==0) return false;
		return true;
	}
}
public class Q_N_pair {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a pair of numbers: ");
		pair entry = new pair(input.nextInt(), input.nextInt());
		System.out.println(entry.coprime() ? "The pair is coprime" : "The pair is not co prime");
	}
}
