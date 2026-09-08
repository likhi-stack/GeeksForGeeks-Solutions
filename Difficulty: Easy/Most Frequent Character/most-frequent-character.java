class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int[] f=new int[26];
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a']++;
        }
        int max=0;
        char res='z';
        for(int i=0;i<26;i++)
        {
            if(f[i]>max)
            {
                max=f[i];
                res=(char)('a'+i);
            }
        }
        return res;
        
    }
}