// write a program to print all the unique subsequences in the string using recursion.

import java.util.*;

public class Recursion11
{
    public static void subsequences(String str, int idx , String newString , HashSet<String> set )
    {
        if(idx==str.length())
        {
            if(set.contains(newString))
            return;
            else
            {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char currChar=str.charAt(idx);

        //to be choose 
        subsequences( str, idx+1 , newString+currChar ,set );

        //not to be choose
        subsequences( str, idx+1 ,newString ,set );
        
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = Sc.next();
        System.out.println();
        HashSet<String> set = new HashSet<>();
        subsequences( str, 0 , " ",set);
    }
}