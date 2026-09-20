class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
        int l=0;
        int r=arr.length-1;
        int count=0;
        while(l<r)
        {
            int s=arr[l]+arr[r];
            if(s<target)
            {
                l++;
            }
            else if(s>target)
            {
                r--;
            }
            else
            {
                if(arr[l]==arr[r])
                {
                    int n=r-l+1;
                    count+=n*(n-1)/2;
                    break;
                }
                int left=arr[l];
                int right=arr[r];
                int lc=0;
                int rc=0;
                while(l<r&&arr[l]==left)
                {
                    lc++;
                    l++;
                }
                while(l<=r&&arr[r]==right){
                    rc++;
                    r--;
                }
                count+=lc*rc;
            }
        }
        return count;
    }
}
