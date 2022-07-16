// write a program to solve tower of hanoi problem.

import java .util.*;

public class TowerOfHanoi
{
    public static void towerCode(int n, String source, String helper, String dest)
    {
        if(n==0)
        {
            System.out.print("Invalid");
            return;
        }
        if(n==1)
        {
            System.out.print("Transfer disk "+n+" from "+source+" to "+dest);
            System.out.println();
            return;
        }

        towerCode( n-1, source, dest, helper);
        System.out.print("Transfer disk "+n+" from "+source+" to "+dest);
        System.out.println();
        towerCode( n-1, helper, source, dest);

    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of disks : ");
        int num = Sc.nextInt();
        System.out.println();
        towerCode( num, "S", "H", "D");
    }
}