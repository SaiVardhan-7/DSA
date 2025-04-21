class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;
        for(int i=0;i<n;i++){
            if(sum==0){
                start = i;
            }
            sum += arr[i];
            if(maxSum<sum){
                maxSum = sum;
                end = i;
            }
            if(sum<0){
                sum = 0;
            }
        }
        // print sub array with maxSum
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
