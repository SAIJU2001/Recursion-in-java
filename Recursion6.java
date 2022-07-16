// write a program to Find 1st and last occurance of an element in the string using recursion.

import java.util.*;

public class Recursion6
{
    public static int first=-1,last=-1;

    public static void FindPosition( int index, String s, char ch)
    {
        if( index==s.length() )
        {
            System.out.println("The first index is : "+first);
            System.out.println("The last index is : "+last);
            return;
        }
            if( ch==s.charAt(index))
            {
                if(first==-1)
                  {  
                    first=index;
                    last=index;
                  }
                else
                     last=index;
            }
            FindPosition( index+1,s,ch);   
        }
    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = Sc.next();
        System.out.println();
        System.out.print("Enter the Character : ");
        char ch = Sc.next().charAt(0);
        System.out.println();
        FindPosition( 0, s, ch );

    }
} 