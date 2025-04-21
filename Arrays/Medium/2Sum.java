import java.util.*;
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;

        for(int i=0;i<n;i++){
            int num = arr[i];
            int moreNeeded = target - num;
            if(map.containsKey(moreNeeded)){
                ans[0] = map.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            map.put(num, i);
        }

        return ans;
    }
}
