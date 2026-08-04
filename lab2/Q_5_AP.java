package lab2;
import java.util.Scanner;
public class Q_5_AP {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first term: ");
        int a = input.nextInt();
        System.out.println("Enter common difference: ");
        int d = input.nextInt();
        System.out.println("Enter number of terms: ");
        int n = input.nextInt();
        System.out.println("The series is:");
        for(int i = 1; i <=n; i++)
        {
           System.out.print(a + ",");
           a += d;
        }
        System.out.print("\b");
        input.close();
    }
}
