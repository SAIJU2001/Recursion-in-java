//print name 5 times using recursion

import java.util.*;

public class PrintNameUsingRecursion
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name=Sc.nextLine();
        System.out.println("Enter the Count : ");
        int count=Sc.nextInt();
        Solution sl=new Solution();
        sl.printName( name, count );
    }
}
class Solution
{
    public void printName( String name, int count )
    {
        if( count<1 )
            return;
        
        System.out.println(name);
        printName( name, count-1 );
    }
}