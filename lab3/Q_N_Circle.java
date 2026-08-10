package lab3;

import java.util.Scanner;

class circle{
	double radius = 1.0;
	final double pi = 3.141592;
	circle(int r)
	{
		radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return pi*radius*radius;
	}
}

public class Q_N_Circle {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		int r = input.nextInt();
		if(r < 0)
		{
			System.out.println("Radius can't be negative");
			return;
		}
		circle a = new circle(r);
		System.out.printf("The radius of this circle is " + a.getRadius());
		System.out.printf("\nThe area of this circle is %.5f", a.getArea());
	}
}
