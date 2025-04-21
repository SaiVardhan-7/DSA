class Solution {
    public int majorityElement(int[] arr) {
        int count = 0;
        Integer candidate = null;

        for(int num : arr){
            if(count==0){
                candidate = num;
            }
            count += (num == candidate)? 1 : -1;
        }

        return candidate;

        // It is also one of the method but, above method is more preferred.

        // Arrays.sort(arr);
        // int n = arr.length;     
        // return arr[n/2];
    }
}
