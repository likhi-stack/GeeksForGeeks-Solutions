class Solution {
    public static boolean nonRepetitive(String s) {
        boolean[] seen=new boolean[26];
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i)!=s.charAt(i-1)) {
                if(seen[s.charAt(i)-'A'])
                    return false;
                seen[s.charAt(i-1)-'A']=true;
            }
        }
        return true;
    }
}