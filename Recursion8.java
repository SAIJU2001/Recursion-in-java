// write a program to move all X to the end of the string using recursion.

import java.util.*;

public class Recursion8
{
    public static void moveAllX(String str, int idx , int count , String newString)
    {
        if(idx==str.length())
        {
            for( int i=0 ; i<count ; i++ )
            {
                newString +='x';
            }
            System.out.print(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x')
        {
            count++;
            moveAllX( str, idx+1 , count , newString );
        }
        else
        {
            newString +=currChar;
            moveAllX( str, idx+1 ,count ,newString);
        }
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = Sc.next();
        System.out.println();
        moveAllX( str, 0 , 0 , " ");
    }
}