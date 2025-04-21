import java.util.*;
class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        if(n==0){
            return 0;
        }
        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;
                int x = num;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }

        return longest;
    }
}
