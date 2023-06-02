//For a given integer of array size n.you have to find all the occurances(indeces) of a given element(key) and print them using recursion and arraylist

// sample input : arr[]={3,2,4,5,6,2,7,2,2},key=2
//sample output :[1,5,7,8]

import java.util.*;

public class Recursion22
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
        ArrayList<Integer>list=findOccurance( arr,target,0,new ArrayList<>() );
        System.out.print(list);
    } 
    
    public static ArrayList<Integer> findOccurance( int arr[],int target,int idx,ArrayList<Integer>list )
    {
        //base case
        if( idx==arr.length )
        {
            return list;
        }

        //occurance check and if found then add list
        if( arr[idx]==target )
        {
            list.add(idx);
        }
        //recursive call
        return findOccurance( arr,target,idx+1,list );
    }
}