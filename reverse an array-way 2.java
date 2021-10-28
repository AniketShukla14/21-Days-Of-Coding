//Reverse an array //
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0)
     {
         int d=sc.nextInt();
         int arr[]=new int[d];
         for(int i=0;i<d;i++)
         {
             arr[i]=sc.nextInt();
         }
   for(int j=d-1;j>=0;j--)
   {
       System.out.print(arr[j]+ " " );
   }
   System.out.println(" ");
     }
	 }
 }