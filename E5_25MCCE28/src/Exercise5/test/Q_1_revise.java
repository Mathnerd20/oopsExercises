package Exercise5.test;
import java.util.Scanner;

import Exercise5.boxClasses.Box;
import Exercise5.boxClasses.BoxWeight;

public class Q_1_revise {
	public static void main(String[] args) {
        var input = new Scanner(System.in);
		BoxWeight a = new BoxWeight();
        a.display();
        Box hello = new Box(2,4,6);
        hello.display();
        hello.increment();
		BoxWeight b = new BoxWeight(hello);
        b.display();
        b.increment();
        b.display();
        hello = b;
        hello.display();
        hello = new Box(hello); //previously a pointer to subclass now pointing to superclass object
        hello.display();
        /* Note to self
         * Method overriding supports runtime polymorphism
         * The specific method to execute is decided while the program runs based on the actual object type */
        input.close();
	}
}
