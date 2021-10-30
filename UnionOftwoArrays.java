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
<img height="180em" src="https://github-readme-stats-eight-theta.vercel.app/api?username=Ankur-Khandelwal&show_icons=true&include_all_commits=true&count_private=true&theme=radical"/>&nbsp;<img height="180em" src="https://github-readme-stats-eight-theta.vercel.app/api/top-langs/?username=Ankur-Khandelwal&layout=compact&langs_count=8&count_private=true&theme=radical"/>

