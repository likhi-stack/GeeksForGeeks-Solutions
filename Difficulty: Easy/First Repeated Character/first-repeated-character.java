class Solution {
    String firstRepChar(String s) {
        // code here
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
        if(hm.containsKey(ch))
        {
            return String.valueOf(ch);
        }
        hm.put(ch,1);
        }
        return "-1";
        
    }
}