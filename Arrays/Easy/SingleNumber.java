class Solution {
    public int singleNumber(int[] arr) {
        int ans = 0;
        for(int num : arr){
            ans ^= num;
        }
        
        return ans;
    }
}
// Time complexity : O(n)
// Space complexity : O(1)

// a ^ a = 0 (any number XOR itself is 0)
// a ^ 0 = a (any number XOR 0 is the number itself)
// So all numbers appearing twice will cancel each other and leave the single number.

// For understanding easy I'm taking input arr : [2,2,3,3,5]
//  0 ^ 2 = 2
//  2 ^ 2 = 0
//  0 ^ 3 = 3
//  3 ^ 3 = 0
//  0 ^ 5 = 5
//  Output : 5
