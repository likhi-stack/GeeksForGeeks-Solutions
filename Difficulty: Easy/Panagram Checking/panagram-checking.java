class Solution {
    public static boolean checkPangram(String s) {
        // code here
        boolean[] l=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                ch=(char)(ch+32);
            }
            if(ch>='a'&&ch<='z')
            {
                l[ch-'a']=true;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(!l[i])
            {
                return false;
            }
        }
        return true;
    }
}