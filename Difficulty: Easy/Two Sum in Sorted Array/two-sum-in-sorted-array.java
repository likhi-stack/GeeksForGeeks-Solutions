class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            int s=arr[l]+arr[r];
            if(s==target){
            ArrayList<Integer>res=new ArrayList<>();
            res.add(l+1);
            res.add(r+1);
            return res;
         }
        else if(s<target){
            l++;
        }
         else{
            r--;
        }
    }
    ArrayList<Integer>res=new ArrayList<>();
    res.add(-1);
    res.add(-1);
    return res;
   }
}