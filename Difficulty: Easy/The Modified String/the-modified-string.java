class Solution {
    public static int modified(String s) {
        int count=0,ans=0;
        for(int i=0;i<s.length();i++) {
            if(i>0&&s.charAt(i)==s.charAt(i-1))
                count++;
            else
                count=1;
            if(count==3) {
                ans++;
                count=1;
            }
        }
        return ans;
    }
}