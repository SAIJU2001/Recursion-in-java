// write a program to check if any array is sorted (strictly increasing) using recursion.

import java.util.*;

import javax.sound.midi.Soundbank;

public class Recursion7
{
    public static boolean checkSorted( int index, int arr[] )
    {
        if( index==arr.length-1 )
            return true;
        
            if( arr[index]<arr[index+1])
                return checkSorted( index+1, arr );
            else
                return false;
   
    }
    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of index : ");
        int index = Sc.nextInt();
        System.out.println();
        int arr[] = new int[index];
        for( int i=0 ; i<index ; i++ )
        {   
            System.out.print("Enter the value of "+i+"th index : ");
            arr[i]= Sc.nextInt();
        }
        System.out.println();
        boolean sort = checkSorted( 0, arr);
        if( sort == true)
        System.out.println("The array is strictly sorted.");
        else
        System.out.println("The array is not strictly sorted.");
    }
} 