package E4_25MCCE28;

import java.util.Scanner;

class lucky{
	int number;
	int order;

	lucky(){
		number = 1;
		order = 1;
	}
	lucky(int n)
	{
		number = n;
		order = lucky.findOrder(this.number);
	}

	public static int findOrder(int n) {
		if(n < 10) {
			return n;
		}
		int sum = n % 10 + findOrder(n/10);
		sum = findOrder(sum);
		return sum;
	}
	
	public static boolean isorder(lucky a, int k) {
		if(lucky.findOrder(a.number) == k) {
			return true;
		}
		return false;
	}

	public void setNumber(int n)
	{
		this.number = n;
		this.order = findOrder(this.number);
	}

	public void getNumber()
	{
		System.out.println(this.number);
		return;
	}

	public void getOrder()
	{
		System.out.println("Order of " + this.number + " is " + this.order);
		return;
	}
}

public class Q_N_luckynumbers {


	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		var a = new lucky();
		int count = 0;
		for(int i = 1; i <= 1000; i++)
		{
			a.setNumber(i);
			if(lucky.isorder(a, 3)) {
				count++;
			}
		}
		System.out.println("There are " + count + " lucky numbers of order 3 between 1 and 1000");
		input.close();
	}
}
