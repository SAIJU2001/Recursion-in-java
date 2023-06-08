import java.util.*;

public class FibonacciUsingRecursion
{
    public static void main(String args[])
    {  
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the upper range : ");
        int n=Sc.nextInt();
        fibo(0,1,n);
    }
    public static void fibo( int a, int b, int n )
    {
        if( n==0 )
        {
            return;
        }
        System.out.print(a+" ");
        int c=a;
        a=b;
        b=b+c;
        fibo(a,b,n-1 );   
    }   
}