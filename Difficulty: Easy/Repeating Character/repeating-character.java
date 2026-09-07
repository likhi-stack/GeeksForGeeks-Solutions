class Solution {
    static int repeatedCharacter(String S) {
        // code here
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<S.length();i++)
        {
            if(hm.get(S.charAt(i))>1)
            {
                return i;
            }
        }
        return -1;
    }
}