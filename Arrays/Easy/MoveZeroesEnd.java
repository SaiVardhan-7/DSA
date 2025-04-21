class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        if(n==1)   return;

        int idx = 0;
        for(int num : arr){
            if(num!=0){
                arr[idx++] = num;
            }
        }

        // Fill the remaining places with 0's
        while(idx<n){
            arr[idx++] = 0;
        }
    }
}
