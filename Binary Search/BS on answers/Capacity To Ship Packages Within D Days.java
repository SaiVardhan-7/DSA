class Solution {
    public static int findDays(int[] arr, int capacity){
        int n = arr.length;
        int days = 1, load = 0;

        for(int i=0;i<n;i++){
            if(arr[i]+load<=capacity){
                load += arr[i];
            }
            else{
                days++;
                load = arr[i];
            }
        }

        return days;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for(int val : weights){
            low = Math.max(low,val);
            high += val;
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            if(findDays(weights,mid)<=days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
