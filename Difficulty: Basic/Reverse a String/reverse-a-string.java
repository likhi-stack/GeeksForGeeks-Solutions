class Solution {
    public static String reverseString(String s) {
        // code here
        String l="";
        for(int i=s.length()-1;i>=0;i--)
        {
            l+=s.charAt(i);
        }
        return l;
        
    }
}