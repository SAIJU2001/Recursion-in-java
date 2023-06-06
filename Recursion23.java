//Write a program to find the length of a string  using recursion

import java.util.*;

public class Recursion23
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        //input string str
        System.out.print("Enter the string : ");
        String str= Sc.next();
        //call the function and print
        System.out.print(length( str ));
    } 
    
    public static int length( String str )
    {
        //base case
        if( str.equals("") )
        {
            return 0;
        }

        //recursive call
        return length( str.substring(1) )+1;
    }
}