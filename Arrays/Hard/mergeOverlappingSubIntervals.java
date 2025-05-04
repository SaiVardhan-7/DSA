import java.util.*;

class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length;

        // Sort intervals based on starting time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If ans is empty or current interval doesn't overlap with the last
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(arr[i]);
            } 
            else {
                // Overlapping intervals, merge by updating end
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
