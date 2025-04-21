class Solution {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if(n==0)   return 0;

        int i = 0;
        for(int num : arr){
            if(num!=arr[i]){
                arr[++i] = num;
            }
        }

        return i+1;
    }
}
