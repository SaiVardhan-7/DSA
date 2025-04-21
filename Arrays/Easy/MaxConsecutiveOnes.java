class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int count = 0, max1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count = 0;
            }
            if(max1<count){
                max1 = count;
            }
        }

        return max1;
    }
}
