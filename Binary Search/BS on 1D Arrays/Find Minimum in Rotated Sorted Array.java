class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int low = 0, high = n-1;
        int ans = Integer.MAX_VALUE;    

        while(low<=high){
            int mid = low+(high-low)/2;

            // If the array is sorted from low to high
            if(arr[low]<=arr[high]){
                ans = Math.min(ans,arr[low]);
                break;
            }
            // To check if left half is sorted
            if(arr[low]<=arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans,arr[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}
