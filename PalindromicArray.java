class GfG
{
	public static int palinArray(int[] arr, int n)
           {
               int va=0,r=0,rev=0;
             for(int i=0;i<n;i++)
             {
                  va=arr[i];
                 while(va!=0)
                 {
                  r=va % 10;
                rev= rev *10 + r;
                va/=10;
                
                 }
                 if(rev != arr[i])
                 return 0;
                 rev=0;
             }
             return 1;
             }
           }