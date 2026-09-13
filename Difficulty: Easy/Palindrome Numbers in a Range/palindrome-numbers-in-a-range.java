class Solution {
    public ArrayList<Integer> printPalindromes(int m,int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=m;i<=n;i++) {
            int x=i,rev=0;
            while(x>0) {
                rev=rev*10+x%10;
                x/=10;
            }
            if(i==rev)
                ans.add(i);
        }
        return ans;
    }
}