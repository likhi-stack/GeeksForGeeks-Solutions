class Solution {
    public int countWords(String s) {
        // code here
        int count=0;
        boolean word=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(!word)
                {
                    count++;
                    word=true;
                }
            }
            else
            {
                word=false;
            }
        }
        return count;
    }
}