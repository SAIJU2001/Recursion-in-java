// write a program to print all binary strings of size n without consecutive 0's

import java.util.*;

public class Recursion20 
{
    public static void binaryStrings( String binary, int n, int lastDigit)
    {
        if( n==0 )
        {
            System.out.println(binary);
            return;
        }

        binaryStrings( binary+"1", n-1, 1);

        //if last digit is 0
        if( lastDigit==1 )
        {
            binaryStrings( binary+"0", n-1, 0);
        }
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the length of binary string : ");
        int n = Sc.nextInt();
        binaryStrings("", n,1);
    }
}
