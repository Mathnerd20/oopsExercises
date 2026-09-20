package testClasses;
import reviseClasses.figure;
import reviseClasses.rectangle;
import reviseClasses.triangle;
import reviseClasses.bank;
import reviseClasses.sbi;
import reviseClasses.pnb;
class A{
	public int k = 12;
	public void display() {
		System.out.println("In the outerclass k = " + k);
		var b = new B();
		b.displayB();
	}
	class B{
		public void displayR() {
			System.out.println("In the inner class k = " + k);
			display();
		}
		public void displayB() {
			System.out.println("Hello this is the inner class");
			k += 5;
		}
	}
}
public class Q_1_revise {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("No arguments provided, provide hexadecimal strings to convert into int");
		}
		for(int i = 0; i < args.length; i++) {
			if(args[i].matches("[0-9A-Fa-f]+")) {
				System.out.println("The decimal equivalent of " + args[i] + " is " +Integer.parseInt(args[i], 16));
			}
			else{
				System.out.println(args[i] + "is not a valid hexadecimal string");
			}
		}
		A a = new A();
		System.out.println(a.k);
		a.display();
		System.out.println("\n");
		A.B b = a.new B();
		b.displayR();
		System.out.println("\n");
		A.B c = new A().new B();
		System.out.println("\n");
		c.displayB();
		System.out.println(a.k);

		figure rect1 = new rectangle(10,12);
		figure tri1 = new triangle(5,12);
		System.out.println("The area of the rectangle is " + rect1.area());
		System.out.println("The area of the triangle is " + tri1.area());

		String ak = "Akshay";
		if(ak.equals("Akshay")){
			System.out.println("The strings are equal");
		}
		if(ak.hashCode() == "Ak".hashCode()){
			System.out.println("The hashcodes are equal");
		}
		bank lol = new pnb();
		System.out.println("ROI: " + lol.rateOfInterest());

		rectangle r1 = new rectangle(4,5);
		figure pointer = r1;
		if(pointer instanceof triangle){
			System.out.println("the pointer is a type of triangle");
			triangle t2 = (triangle) pointer;
		}
		else{
			System.out.println("the pointer is a type of rectangle");
			rectangle r2 = (rectangle) pointer;
			System.out.println("The area is " + r2.area());
		}
	}
}
