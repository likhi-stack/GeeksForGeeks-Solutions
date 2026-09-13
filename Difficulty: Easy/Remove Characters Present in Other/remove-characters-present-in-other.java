class Solution {
    public String removeChars(String s1,String s2) {
        boolean[] a=new boolean[26];
        StringBuilder ans=new StringBuilder();
        for(char ch:s2.toCharArray())
            a[ch-'a']=true;
        for(char ch:s1.toCharArray()) {
            if(!a[ch-'a'])
                ans.append(ch);
        }
        return ans.toString();
    }
}