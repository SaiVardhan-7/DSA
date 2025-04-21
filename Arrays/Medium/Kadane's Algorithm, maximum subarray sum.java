import java.util.*;

class Solution {
    public int maxSubArray(int[] arr) {
        // int maxSum = Integer.MIN_VALUE;
        // int sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum += arr[i];
        //     maxSum = Math.max(maxSum,sum);
        //     if(sum<0){
        //         sum = 0;
        //     }
        // }

        // return maxSum;         //Both the solutions are same

        int maxSum = arr[0];
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum = Math.max(arr[i],sum+arr[i]);
            maxSum = Math.max(maxSum,sum);
        }

        return maxSum;
    }
}
