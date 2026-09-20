class Solution{
    int countPairs(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;

        for(int x:arr){
            int y=target-x;

            if(map.containsKey(y)){
                count+=map.get(y);
            }

            map.put(x,map.getOrDefault(x,0)+1);
        }

        return count;
    }
}