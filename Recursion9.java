// write a program to remove duplicates from the string using recursion.

import java.util.*;

public class Recursion9
{
    public static boolean map[] = new boolean[26];
    
    public static void removeDuplicates(String str, int idx , String newString)
    {
        if(idx==str.length())
        {
            System.out.print(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true)
        {
            removeDuplicates( str, idx+1 ,newString);
        }
        else
        {
            newString +=currChar;
            map[currChar-'a']=true;
            removeDuplicates( str, idx+1 , newString );
        }
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = Sc.next();
        System.out.println();
        removeDuplicates( str, 0 , " ");
    }
}