//For a given integer of array size n.you have to find all the occurances(indeces) of a given element(key) and print them using recursion

// sample input : arr[]={3,2,4,5,6,2,7,2,2},key=2
//sample output :[1,5,7,8]

import java.util.*;

public class Recursion21
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        //input array size
        System.out.print("Enter the length of the array : ");
        int n= Sc.nextInt();
        int arr[]=new int[n];
        //input array element
        for( int i=0 ; i<n ; i++ )
        {
            System.out.print("Enter the value of index "+i+" : ");
            arr[i]=Sc.nextInt();
        }
        //input key
        System.out.print("Enter the key value : ");
        int target=Sc.nextInt();
        //call the function
        findOccurance( arr,target,0 );
    } 
    
    public static void findOccurance( int arr[],int target,int idx )
    {
        //base case
        if( idx==arr.length )
        {
            return;
        }

        //occurance check and if found then print
        if( arr[idx]==target )
        {
            System.out.print( idx+" ");
        }
        //recursive call
        findOccurance( arr,target,idx+1 );
    }
}