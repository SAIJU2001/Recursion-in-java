// write a program to place the tiles of size 1xm in a floor of size nxm.

import java.util.*;

public class Recursion15 
{
    public static int PlaceTiles( int n, int m )
    {
        if( n==m )
        return 2;

        if( n<m )
        return 1;

        int horizon = PlaceTiles( n-1, m );
        int vert = PlaceTiles( n-m, m );
        return horizon+vert;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n' means tiles row : ");
        int n = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the value of 'm' means tiles column : ");
        int m = Sc.nextInt();
        System.out.println();
        int countPlace=PlaceTiles( n, m );
        System.out.print("The total no of paths are : "+countPlace);
    }    
}
