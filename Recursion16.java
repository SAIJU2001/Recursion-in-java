// write q program to find the number of ways in which you can invite n people to your party,single or pair.

import java.util.*;

public class Recursion16 
{
    public static int CallGuests( int n)
    {
        if( n<=1 )
        return 1;
        //for single
        int ways1=CallGuests( n-1 );
        int ways2=(n-1)*CallGuests( n-2 );
        return ways1+ways2;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of people : ");
        int n = Sc.nextInt();
        System.out.println();
        int ways=CallGuests( n);
        System.out.println("The number of ways are : "+ways);
    }
    
}
