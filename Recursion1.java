// write a program to print 1 to n number.

import java.util.*;

public class Recursion1
{
    
    public static int num;
    public static void number_print(int i)
    {
        if( i==num+1 )
        {
             return;
        }
        System.out.println(i);
        i++;
        number_print(i);
    }   
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = Sc.nextInt();
        System.out.println();
        int i=1;
        number_print(i);
    }
}