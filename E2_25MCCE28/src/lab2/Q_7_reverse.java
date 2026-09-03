package lab2;

import java.util.Scanner;

public class Q_7_reverse {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer within 32 bits range (" + Integer.MAX_VALUE +" > x > " + Integer.MIN_VALUE +")");
        int n = input.nextInt();
        char[] bits = new char[32];
        int i = 0;
        while(n > 0)
        {
            bits[i] =  (char)((n & 1) + '0'); //extracting unit digit and putting in array (which results in reversing)
            n = n >>> 1; //discard the extracted digit
            i++;
        }
        while(i < 32)
        {
           bits[i] = '0';
           i++;
        }
        int out = 0;
        for(i = 0; i < 32 ; i++)
        {
            if(bits[i] == '1') out += (int)Math.pow(2, 31-i);
        }
        String reverse = new String(bits);
        System.out.println("The 32 bit out string is: " + reverse + " and the number is: " + out);
    }
}
