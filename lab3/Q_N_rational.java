package lab3;

import java.util.Scanner;

public class Q_N_rational {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numerator and denominator of 1st rational number A: ");
        rational a = new rational();
        a.num = input.nextInt();
        a.den = input.nextInt();
        if(a.den == 0)
        {
            System.out.printf("Error: Denominator can't be zero");
            return;
        }
        a.simplify();
        System.out.println("Simplified fraction is: " + a.num + "/" + a.den);

        System.out.println("Enter numerator and denominator of 1st rational number B: ");
        rational b = new rational();
        b.num = input.nextInt();
        b.den = input.nextInt();
        if(b.den == 0)
        {
            System.out.printf("Error: Denominator can't be zero");
            return;
        }
        b.simplify();
        System.out.println("Simplified fraction is: " + b.num + "/" + b.den);
        rational sum = rational.add(a,b);
        System.out.println("Their sum is: " + sum.num + "/" + sum.den);

        rational diff = rational.subtract(a,b);
        System.out.println("Their difference is: " + diff.num + "/" + diff.den);

        rational pdt = rational.multiply(a,b);
        System.out.println("Their product is: " + pdt.num + "/" + pdt.den);

        rational div = rational.divide(a,b);
        System.out.println("Their division is: " + div.num + "/" + div.den);
        input.close();
    }
}
