class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // code here
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int x=target-arr[i];
            if(hs.contains(x))
            {
                List<Integer>res=new ArrayList<>();
                res.add(x);
                res.add(arr[i]);
                return res;
            }
            hs.add(arr[i]);
        }
        return new ArrayList<>();
    }
}