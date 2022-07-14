// write a program to print sum of first n natural number.

import java.util.*;

public class Recursion2
{
    public static int sum=0;
    public static void number_print(int num)
    {
        if( num<=0 )
        {
            System.out.print("The sum of the natural number is : "+sum);
             return;
        }
        sum=sum+num;
        number_print(num-1);
    }   
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Sc.nextInt();
        System.out.println();
        number_print(n);
    }
}