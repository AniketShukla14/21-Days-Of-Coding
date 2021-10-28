//minimum and maximum in an array //

class Compute 
{
    static pair getMinMax(long arr[], long n)  
    {
        //Write your code here
        long min=arr[0];
        long max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
       return new pair(min, max);
    }
}

