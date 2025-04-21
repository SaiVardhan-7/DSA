import java.util.*;

class Solution {
    public static ArrayList<Integer> leaders(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> leaders = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(max<arr[i]){
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(leaders);

        return leaders;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)
