class Solution {
    // public static int sumByD(int []arr, int div){
    //     int n = arr.length;
    //     int sum = 0;
    //     for(int i=0;i<n;i++){
    //         sum += Math.ceil((double)arr[i]/(double)div);
    //     }

    //     return sum;
    // }

    public static int sumByD(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += (num + div - 1) / div; // Equivalent to ceil(num / div)
        }
        return sum;
    }
    public static int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        if(n>threshold)   return -1;

        int low = 1, high = 0;
        for (int num : arr) {
            high = Math.max(high, num);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            if(sumByD(arr,mid)<=threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
