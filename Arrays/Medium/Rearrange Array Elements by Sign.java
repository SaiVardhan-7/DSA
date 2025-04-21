class Solution {
    public int[] rearrangeArray(int[] arr) {
        int result[] = new int[arr.length];
        int pos = 0, neg = 1;

        for(int num : arr){
            if(num>=0){
                result[pos] = num;
                pos += 2;
            }
            else{
                result[neg] = num;
                neg += 2;
            }
        }

        return result;
    }
}
