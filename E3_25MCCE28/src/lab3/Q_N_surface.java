package lab3;

import java.util.Scanner;

class Box{
	int length = 1;
	int width = 1;
	int height = 1;
	Box(int l, int b, int h)
	{
		length = l;
		width = b;
		height = h;
	}
	public int getSA()
	{
		return 2*(length*width + width*height + height*length);
	}
}

public class Q_N_surface {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter dimensions of box(l,b,h): ");
		Box a = new Box(input.nextInt(), input.nextInt(), input.nextInt());
		System.out.println("The total surface area is: " + a.getSA());
		input.close();
	}
}
