// print linearly from 1 to N

import java.util.*;

public class PrintLinearlyUsingRecursion
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Last Number : ");
        int num=Sc.nextInt();
        Solution sl=new Solution();
        sl.printNum( num, 1 );
    }
}
class Solution
{
    public void printNum( int num, int val )
    {
        if( num+1==val )
            return;
        
        System.out.println(val);
        printNum( num, val+1 );
    }
}