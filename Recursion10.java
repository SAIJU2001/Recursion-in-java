// write a program to print all the subsequences in the string using recursion.

import java.util.*;

public class Recursion10
{
    public static void subsequences(String str, int idx , String newString)
    {
        if(idx==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);

        //to be choose 
        subsequences( str, idx+1 , newString+currChar );

        //not to be choose
        subsequences( str, idx+1 ,newString );
        
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = Sc.next();
        System.out.println();
        subsequences( str, 0 , " ");
    }
}