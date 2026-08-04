package lab2;

import java.util.Scanner;

public class Q_9_vectAdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter length of first array");
		int a = input.nextInt();
		System.out.println("Enter elements in first array in sequence");
		int[] a1 = new int[a];
		for(int i = 0; i < a; i++) a1[i] = input.nextInt();
		System.out.print("A : " + "(");
		for(int i = 0; i < a; i++) System.out.print(a1[i] + ",");
		System.out.println("\b)");

		System.out.println("Enter length of second array");
		int b = input.nextInt();
		System.out.println("Enter elements in second array in sequence");
		int[] b1 = new int[b];
		for(int i = 0; i < b; i++) b1[i] = input.nextInt();
		System.out.print("B : " + "(");
		for(int i = 0; i < b; i++) System.out.print(b1[i] + ",");
		System.out.println("\b)");

		int[] sum = new int[Math.max(a, b)];
		for(int i = 0; i < Math.min(a, b); i++)
		{
			sum[i] = a1[i] + b1[i];
		}
		if(a == Math.max(a, b))
		{
			for(int i = b; i < a; i++)
				sum[i] = a1[i];
		}
		else {
			for(int i = a; i < b; i++)
				sum[i] = b1[i];
		}
		System.out.print("A + B : (");
		for(int i : sum) System.out.print(i + ",");
		System.out.println("\b)");
	}
}
