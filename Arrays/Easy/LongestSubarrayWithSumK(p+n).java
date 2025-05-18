class Solution {
    public int longestSubarray(int[] arr, int k) {
       int n = arr.length;

       Map<Integer,Integer> map = new HashMap<>();
       int prefixSum = 0;
       int maxLen = 0;

       for(int i=0;i<n;i++){
            prefixSum += arr[i];
            if(prefixSum==k){
                maxLen = Math.max(maxLen,i+1);
            }
            int rem = prefixSum - k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen,len);
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
       }

       return maxLen;
    }
}
