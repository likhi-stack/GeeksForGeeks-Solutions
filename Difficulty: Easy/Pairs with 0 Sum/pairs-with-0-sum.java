class Solution{
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==0){
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(arr[l]);
                pair.add(arr[r]);
                res.add(pair);
                int x=arr[l];
                int y=arr[r];
                while(l<r&&arr[l]==x)
                    l++;
                while(l<r&&arr[r]==y)
                    r--;
            }
            else if(sum<0){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}