class sol{
    public static void main(String[] args)
    {
        int size=arr.length();
        Arrays.sort(arr);
        if(size%2==0)
        {
            return (arr[(size/2)] + arr[(size/2)-1])/2;
        }
        return arr[size/2];
    }
}