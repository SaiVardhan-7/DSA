class Solution {
    public static boolean possible(int []arr, int day, int m, int k){
        int n = arr.length;
        int count = 0, noOfB = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                noOfB += (count/k);
                count = 0;
            }
        }
        noOfB += (count/k);

        return noOfB>=m;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = (long)m*k;
        if(val>n)   return -1;

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,bloomDay[i]);
            min = Math.min(min,bloomDay[i]);
        }

        // It can also use but it increases the runtime
        // int min = Arrays.stream(bloomDay).min().getAsInt();   
        // int max = Arrays.stream(bloomDay).max().getAsInt();

        int low = min, high = max;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
