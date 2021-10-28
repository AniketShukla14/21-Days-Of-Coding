// Reverse an array //
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
         reverse(arr,0,d-1);
         for(int i=0;i<d;i++)
         {
             System.out.print(arr[i]+ " ");
         }
         System.out.println(" ")
     }
	 }
	 public static void reverse(int arr[],int l,int r)
	 {
	     while(l<r)
	     {
	         int temp=arr[r];
	         arr[r]=arr[l];
	         arr[l]=temp;
	         l++;
	         r--;
	     }
	 }
}