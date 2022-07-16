// write a program to print a string in reverse order using recursion.

import java.util.*;

public class Recursion5
{
    public static void reverse( int n, String sn )
    {
        if( n<=0 )
        {
            System.out.print(sn.charAt(n)+" ");
            return;
        }
        System.out.print(sn.charAt(n)+" ");
        reverse(n-1,sn);
    }
        
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = Sc.next();
        System.out.println();
        int index = s.length();
        reverse(index-1,s);

    }
}