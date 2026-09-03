package E4_25MCCE28;

import java.util.Scanner;
class circle{
	double radius = 1.0;
	circle(double r)
	{
		radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	public double getArea()
	{
		return Math.PI * Math.pow(radius,2);
	}
}

public class Q_N_three {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		circle a = new circle(input.nextDouble());
		System.out.println("The radius of the circle is: " + a.getRadius());
		System.out.println("The perimeter of circle is: " + Math.round(a.getPerimeter() * 100)/100.0);
		System.out.println("The area of circle is: " + Math.round(a.getArea() * 100)/100.0);
		//reference taken from https://www.javaspring.net/blog/how-to-round-to-two-decimal-places-in-java/
	}
}
