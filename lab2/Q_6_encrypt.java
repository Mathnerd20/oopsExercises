package lab2;

import java.util.Scanner; 

public class Q_6_encrypt {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter String:");
		String msg = input.nextLine();
		System.out.println("Enter increment value:");
		int k = input.nextInt();

		char[] enc = new char[msg.length()];
		for(int i = 0; i < msg.length(); i++)
		{
			enc[i] = (char)((int)msg.charAt(i) + k);
			//getting char from array, converting it into int (ASCII value, incrementing by given number k, again change int(ASCII value) to char)
		}

		String ans = new String(enc);
		System.out.println(ans);
		input.close();
	}
}
