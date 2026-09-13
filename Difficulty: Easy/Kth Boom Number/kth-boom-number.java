class Solution {
    public String boomNumber(int k) {
        StringBuilder ans=new StringBuilder();
        k--;
        while(k>=0) {
            if(k%2==0)
                ans.append('2');
            else
                ans.append('3');

            k=k/2-1;
        }
        return ans.reverse().toString();
    }
}