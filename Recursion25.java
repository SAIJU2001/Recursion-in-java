//you are given a number convert it into string of english

import java.util.*;

public class Recursion25
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        //input the number
        System.out.print("Enter the number : ");
        int num= Sc.nextInt();
        //function call
        convertEnglish( num);
    }
    //string array which stores our english conversion and it is a global array
    public static String english[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public static void convertEnglish( int num)
    {
        //base case
        if( num==0 )
        {
            return ;
        }

        //find the digit
        int lastDigit=num%10;
        //recursive call
        convertEnglish( num/10);
        //when back from recursion stack then print
        System.out.print( english[lastDigit]+" ");
    }
}