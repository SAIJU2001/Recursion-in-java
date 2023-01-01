// print linearly from N to 1

import java.util.*;

public class PrintLinearlyReverseUsingRecursion
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Last Number : ");
        int num=Sc.nextInt();
        Solution sl=new Solution();
        sl.printNum( num );
    }
}
class Solution
{
    public void printNum( int num )
    {
        if( num<=0 )
            return;
        
        System.out.println( num );
        printNum( num-1 );
    }
}