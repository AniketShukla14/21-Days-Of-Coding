//Cyclically rotate an array by one //
class Compute {
    
    public void rotate(int arr[], int n)
    {
        int l=0;
        int r=n-1;
        while(l<r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
        }
    }
}