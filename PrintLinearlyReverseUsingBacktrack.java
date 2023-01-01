//print linearly from N to 1 using backtracking
import java.util.*;

public class PrintLinearlyReverseUsingBacktrack
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        Solution sl=new Solution();
        sl.printNum( num ,1 );
    }
}

class Solution
{
    void printNum( int num, int initial )
    {
        if( num==initial-1 )
            return;

        printNum( num, initial+1 );
        System.out.println( initial );
    }
}

        