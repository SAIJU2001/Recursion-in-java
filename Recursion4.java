// write a program to print the fibonacci series of n number.

import java.util.*;

public class Recursion4
{
    public static int k=0,num,l=1;
    public static void number_print(int i)
    {
        if( i==num )
        {
             return;
        }
        System.out.print(k);
        int fibo=k+l;
        k=l;
        l=fibo;
        number_print(i+1);
    }   
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = Sc.nextInt();
        System.out.println();
        int i=0;
        number_print(i);
    }
}