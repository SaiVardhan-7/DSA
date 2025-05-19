import java.util.*;
public class tUf {
    public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int xr = 0;
        Map<Integer, Integer> map = new HashMap<>(); //declaring the map.
        mpp.put(xr, 1); //setting the value of 0.
        int count = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ a[i];
            //By formula: x = xr^k:
            int x = xr ^ k;
            // add the occurrence of xr^k
            // to the count:
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            // Insert the prefix xor till index i
            // into the map:
            if (map.containsKey(xr)) {
                map.put(xr, map.get(xr) + 1);
            } else {
                map.put(xr, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
