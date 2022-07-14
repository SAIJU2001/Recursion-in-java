// write a program to print the factorial of n number.

import java.util.*;

public class Recursion3
{
    public static int fact=1;
    public static void number_print(int num)
    {
        if( num==0 )
        {
            System.out.print("The factorial is : "+fact);
             return;
        }
        fact=fact*num;
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