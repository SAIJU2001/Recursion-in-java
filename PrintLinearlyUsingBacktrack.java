//print linearly from 1 to N using backtracking
import java.util.*;

public class PrintLinearlyUsingBacktrack
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        Solution sl=new Solution();
        sl.printNum( num );
    }
}

class Solution
{
    void printNum( int num )
    {
        if( num<=0)
            return;

        printNum( num-1 );
        System.out.println( num );
    }
}

        