class Solution {
    public static long product(int mid, int n, int M){   // mid^n
        long ans = 1;
        long base = mid;

        while(n > 0){
            if(n % 2 == 1){
                ans *= base;
                if(ans > M) return ans;  // Early exit to avoid unnecessary computation
            }
            base *= base;
            if(base > M) return base;
            n /= 2;  // Always divide n by 2 in every iteration
        }

        return ans;
    }

    public static int NthRoot(int N, int M) {
        int low = 1, high = M;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long val = product(mid, N, M);
            if(val == M){
                return mid;
            } else if(val < M){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;  // If no integer root is found
    }
}
