package lab2;

import java.util.Scanner;

public class Q_4_repeat {
   static void main() {
       Scanner input = new Scanner(System.in);
       boolean repeat;
       do{
           System.out.println("Enter a: ");
           int a = input.nextInt();
           System.out.println("Enter b: ");
           int b = input.nextInt();
           System.out.println("Sum of a and b is " + (a+b));
           System.out.println("Repeat again (true to repeat, false to exit)?");
           repeat = input.nextBoolean();
       }while(repeat);
       input.close();
   }
}
