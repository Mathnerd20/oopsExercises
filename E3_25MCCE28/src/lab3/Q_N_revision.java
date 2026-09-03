package lab3;

import java.util.Scanner;

class rectangle{
	int length;
	int breadth;
	rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	int getArea() {
		return length * breadth;
	}
}

class square{
	int side;
	square(){
		int side = 1;
	}
	square(int a){
		side = a;
	}
	int getArea(){
		return side * side;
	}
}
 class weightSquare extends square{
	int weight;
	weightSquare(){
		this.side = 2;
		this.weight = 1;
	}
 }

//class circle{
//	private int radius = 3;
//	final double pi = 3.14159;
//	circle()
//	{
//		radius = 3;
//	}
//	circle(int r)
//	{
//		radius = r;
//	}
//	public int getRadius()
//	{
//		return radius;
//	}
//	public double getArea()
//	{
//		return pi * Math.pow(radius, 2);
//	}
//}

public class Q_N_revision {
	static void hello()
	{
		System.out.println("Hello!");
		return;
	}

	static int hello(int x, int y)
	{
		return x+y;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		hello();
		System.out.println("Enter 2 numbers: ");
		int sum = hello(input.nextInt(), input.nextInt());
		System.out.println("Sum of 2 numbers is: " + sum);
		System.out.println("The number 4 wont appear here :)");
		for(int i = 1; i < 10; i++)
		{
			if(i == 4)
				continue;
			System.out.printf("%d", i);
		}
		System.out.printf("\n");
		for(int i = 1; i < 10; i++)
		{
			System.out.printf("%d", i);
			if(i == 4)
				break;
		}
		System.out.printf("\n");
		System.out.println("The number 4 broke the loop :(");
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ Separator \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

		System.out.println("Enter dimenstions of rectangle (length, breadth):");
		rectangle one = new rectangle(input.nextInt(), input.nextInt());
		System.out.println("The area of rectangle is " + one.getArea());

		System.out.println("Enter dimenstions of square (side length):");
		square sq = new square(input.nextInt());
		System.out.println("The area of square is " + sq.getArea());

		circle secret = new circle(1); //the circle class used here is from the Q_N_Circle
		System.out.println("The radius of secret circle is: " + secret.getRadius());
		System.out.println("The area of secret circle is: " + secret.getArea());

		input.close();
	}
}
