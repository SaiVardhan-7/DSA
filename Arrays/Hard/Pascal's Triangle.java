import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> w = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    w.add(1);
                } else {
                    int val = a.get(i-1).get(j-1) + a.get(i-1).get(j);
                    w.add(val);
                }
            }
            a.add(w);
        }

        return a;
    }
}
