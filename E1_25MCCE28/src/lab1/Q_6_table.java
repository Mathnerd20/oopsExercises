package lab1;

import java.util.Scanner;
public class Q_6_table {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers in a sequence:");
		System.out.println("Number \t       Square \tCube");
		for(int i = 1; i <= 10 ; i++)
		{
			int n = input.nextInt();
			System.out.print("\033[1A\033[15C" + (n*n) + "\t" + (n*n*n) + "\n"); 
            // This ansi code i took from the internet https://stackoverflow.com/questions/45068783/java-how-to-print-output-to-previous-line-after-input
		}
		input.close();
	}
}
