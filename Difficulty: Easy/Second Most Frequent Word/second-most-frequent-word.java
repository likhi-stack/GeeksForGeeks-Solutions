class Solution {
    public int secFrequent(String[] arr) {
        // code here
        HashMap<String,Integer>hm=new HashMap<>();
        for(String res:arr)
        {
            hm.put(res,hm.getOrDefault(res,0)+1);
        }
        int max=0;
        int sec=0;
        for(String res:hm.keySet())
        {
            if(hm.get(res)>max)
            {
                max=hm.get(res);
            }
        }
        for(String res:hm.keySet())
        {
            int count=hm.get(res);
            if(count>sec&&count<max)
            {
                sec=count;
            }
        }
        if(sec==0){
        return -1;
        }
        return sec;
    }
    
}