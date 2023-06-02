// write a program to print all the subset of a set of first n natural number .

import java.util.*;

public class Recursion17 
{
    public static void subset( ArrayList<Integer>list,int n)
    {
        if(n==0 )
        {
            for( int i=0 ; i<list.size() ; i++ )
            {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
            return;
        }

        //for choosing the value 
        list.add(n);
        subset( list, n-1);

        //for not choosing the value
        list.remove(list.size()-1);
        subset( list, n-1);

    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the value of last natural number : ");
        int n=Sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        subset( list, n);
    }
}
