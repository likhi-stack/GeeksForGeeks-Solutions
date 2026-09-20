
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n=arr.length;
        int l=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]){
                l=i+1;
                break;
            }
        }
        int r=(l-1+n)%n;
        while(l!=r){
            int s=arr[l]+arr[r];
            if(s==target)
            {
                return true;
            }
            else if(s<target)
            {
                l=(l+1)%n;
            }
            else
            {
                r=(r-1+n)%n;
            }
        }
        return false;
    }
}
