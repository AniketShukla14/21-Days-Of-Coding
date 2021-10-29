
class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int p=1;
        for( int i=0;i<n;i++)
        {
            if(arr[i]==p)
             list.add(p);
            p+=1;
        }
        
        return list;
    }
}