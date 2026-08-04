package lab2;
import java.util.Scanner;

public class Q_10_multiply {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dimensions of first array (first row, then column)");
        int ar = input.nextInt();
        int ac = input.nextInt();
        int[][] a = new int[ar][ac];
        System.out.println("Enter elements of a, row wise");
        for(int i = 0; i < ar; i++)
        {
            for(int j = 0; j < ac; j++)
            {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix A: ");
        for(int[] row : a)
        {
            System.out.print("(");
            for(int i : row)
            {
                System.out.print(i + ",");
            }
            System.out.println("\b)");
        }

        System.out.println("Enter dimensions of second array:");
        int br = input.nextInt();
        int bc = input.nextInt();
        int[][] b = new int[br][bc];
        System.out.println("Enter elements of b, row wise");
        for(int i = 0; i < br; i++)
        {
            for(int j = 0; j < bc; j++)
            {
                b[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix B: ");
        for(int[] row : b)
        {
            System.out.print("(");
            for(int i : row)
            {
                System.out.print(i + ",");
            }
            System.out.println("\b)");
        }

        if(ac != br)
        {
            System.out.println("Multiplication not possible");
            input.close();
            return;
        }

        int[][] c = new int[ar][bc];
        for(int[] row: c)
        {
            for(int i : row)
            {
                i = 0;
            }
        }
        for(int i = 0; i < ar; i++){
            for(int j = 0; j < bc; j++)
            {
                for(int k = 0; k < ac; k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of A and B is:");
        for(int[] row : c)
        {
            System.out.print("(");
            for(int i : row)
            {
               System.out.print(i + ",");
            }
            System.out.println("\b)");
        }
    }
}
