class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int p=0;
        HashSet<Integer> h =new HashSet<>();
        for(int d:a)
        {
            if(!h.contains(d))
            {
                h.add(d);
                p++;
            }
        }
        for(int f:b)
        {
            if(!h.contains(f))
            {
                h.add(f);
                p++;
            }
        }
        return p;
    }
}