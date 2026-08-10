package lab3;

import java.util.Scanner;
public class Q_N_vowel {
	static boolean isVowel(char entry)
	{
		switch(entry)
		{
		case 'a' | 'A':
		case 'e' | 'E':
		case 'i' | 'I':
		case 'o' | 'O':
		case 'u' | 'U':
			return true;
		default:
			return false;
		}
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String a;
		System.out.println("Enter input string: ");
		a = input.nextLine();
		int vowelCount = 0;
		for(int i = 0; i < a.length(); i++)
		{
			if(isVowel(a.charAt(i))) vowelCount++;
		}
		System.out.println("Number of vowels is: " + vowelCount);
		input.close();
	}
}
