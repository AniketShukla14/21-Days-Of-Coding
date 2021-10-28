//Sort an array having 0 , 1 and 2s //
class Solution
{
    public static void sort012(int arr[], int n)
    {
        // code here 
        int a[]=new int[n];
        int j=0;
        int zero=0,one=0,two=0;
        for(int i=0;i<n;i++)
        {
        switch(arr[i])
        {
        case 0:
            zero++;
            break;
        case 1:
            one++;
            break;
        case 2:
            two++;
            break;
        }
        }
        while(zero-->0)
        a[j++]=0;
        while(one-->0)
        a[j++]=1;
        while(two-->0)
        a[j++]=2;
    
        for(int i=0;i<n;i++)
        arr[i]=a[i];
    }
    
}
