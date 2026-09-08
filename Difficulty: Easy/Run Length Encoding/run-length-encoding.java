class Solution{
    public String encode(String s){
        StringBuilder ans=new StringBuilder();
        int count=1;

        for(int i=0;i<s.length();i++){
            if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                ans.append(s.charAt(i));
                ans.append(count);
                count=1;
            }
        }

        return ans.toString();
    }
}
