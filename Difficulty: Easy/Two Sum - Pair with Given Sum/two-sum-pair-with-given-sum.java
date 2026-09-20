class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int need=target-arr[i];
            if(s.contains(need))
            {
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }
}