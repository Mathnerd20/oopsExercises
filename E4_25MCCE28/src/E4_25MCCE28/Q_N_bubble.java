package E4_25MCCE28;

import java.util.Scanner;

public class Q_N_bubble {

	public static void bubble(int i, int j, int[] a) {
		if(i > a.length - 1 || j > a.length - 1)
			return;
		/* The above is the limiter of recursion. 
		 * It stops the procedure from going out of bounds*/
		if(a[i] > a[j]) {
			int k = a[i];
			a[i] = a[j];
			a[j] = k;
		}
		/* swap logic */
		bubble(i, j+1, a); 
		bubble(i+1, j+1, a);
	}
		/* lets map the iterative bubble sort version to a matrix, 
		 * (i,j) means swap a[i] and a[j] 
		 * for simplicity lets take array size 3
		 * so iterative matrix is like
		 * [0,0|0,1|0,2]
		 * [1,0|1,1|1,2]
		 * [2,0|2,1|2,2] 
		 * now the first recursion call will traverse through the first row till it gets terminated at 0,2 
		 * (which makes first element sorted as we compared it with entire array)
		 * then the second recursion call at 0,2 goes to the cell below it and checks it.
		 * again this process repeats at 1,1 which makes element at index 1 sorted
		 * The flow of recursion is something like this
		 * -->(0,0)-->(0,1)-->(0,2)|
		 *         -->(1,1)-->(1,2)v  here (1,2) is performed twice which is useless.
		 *                 -->(2,2)
		 * Its iterative version would be like
		 * for(int i = 0; i < a.length ; i++){
		 *  	for(int j = i; j < a.length; j++)
		 *  		{ 
		 *  			if(a[i] > a[j] swap(a[i],a[j]);
		 *  		}
		 * }
		 * */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int n = input.nextInt();

		System.out.println("Enter elements of array: ");
		var array = new int[n];
		for(int i = 0; i < n; i++) array[i] = input.nextInt();

		bubble(0, 0, array);

		for(int i : array)
		{
			System.out.print(i + " " );
		}
	}
}
