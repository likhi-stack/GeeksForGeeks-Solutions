class Solution{
    int countPairs(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        int count=0;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                if(arr[l]==arr[r]){
                    int n=r-l+1;
                    count+=n*(n-1)/2;
                    break;
                }
                int x=arr[l];
                int y=arr[r];
                int lc=0;
                int rc=0;
                while(l<r&&arr[l]==x){
                    lc++;
                    l++;
                }
                while(l<=r&&arr[r]==y){
                    rc++;
                    r--;
                }
                count+=lc*rc;
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return count;
    }
}