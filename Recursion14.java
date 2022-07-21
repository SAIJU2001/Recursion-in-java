// write a program to count total paths in a maze to move from (0,0) to (n,m)

import java.util.*;

public class Recursion14 
{
    public static int countPaths( int i, int j, int n, int m)
    {
        if( i==n || j==m)
        {
            return 0;
        }
        if( i==n-1 || j==m-1)
        {
            return 1;
        }

        int horizon=countPaths( i, j+1, n, m);
        int vert=countPaths( i+1, j, n, m);

        return horizon+vert;

    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n' means row : ");
        int n = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the value of 'm' means column : ");
        int m = Sc.nextInt();
        System.out.println();
        int count=countPaths( 0, 0, n, m);
        System.out.print("The total no of paths are : "+count);
    }
    
}
