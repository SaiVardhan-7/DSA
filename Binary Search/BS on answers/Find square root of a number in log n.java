class Solution {
    public long floorSqrt(long n) {
        long low = 0, high = n;
        long ans = 1;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;

            if ((mid*mid)<=n) { // [mid <= n / mid] avoids overflow
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
