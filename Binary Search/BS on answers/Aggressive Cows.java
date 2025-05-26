class Solution {
    public static boolean canWePlace(int[] arr, int dist, int k){
        int n = arr.length;
        int cntCows = 1, last = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-last >= dist){
                cntCows++;
                last = arr[i];
            }
            if(cntCows>=k){
                return true;
            }
        }

        return false;
    }

    public static int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);

        int low = 1, high = arr[n-1] - arr[0];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canWePlace(arr,mid,k)){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return high;
    }
}
