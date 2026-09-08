class Solution {
    public String maximumFrequency(String s) {
        // Code here
        String[] w=s.split(" ");
        HashMap<String,Integer>hm=new HashMap<>();
        for(String wl:w)
        {
            hm.put(wl,hm.getOrDefault(wl,0)+1);
        }
        String res=w[0];
        int max=hm.get(res);
        for(String wl:w)
        {
            if(hm.get(wl)>max)
            {
                max=hm.get(wl);
                res=wl;
            }
        }
        return res+ " " + max;
        
    }
}