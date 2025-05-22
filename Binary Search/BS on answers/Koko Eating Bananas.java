// class Solution {
//     public static int findMax(int[] arr) {
//         int max = arr[0]; 
//         for (int val : arr) {
//             if (val > max) {
//                 max = val;
//             }
//         }
//         return max;
//     }
//     public static int totalHours(int []arr, int hourly){
//            int totalH = 0;
//            int n = arr.length;
//            for (int i = 0; i < n; i++) {   //find total hours
//                totalH += Math.ceil((double)(arr[i]) / (double)(hourly));
//            }
//            return totalH;
//     }
//     public static int minEatingSpeed(int[] piles, int h) {
//         int low = 1, high = findMax(piles);
//         int ans = high;

//         while(low<=high){
//             int mid = low+(high-low)/2;
//             int totalH = totalHours(piles,mid);
//             if(totalH<=h){
//                 ans = mid;
//                 high = mid - 1;
//             }
//             else{
//                 low = mid + 1;
//             }
//         }
        
//         return ans;
//     }
// }

class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for (int pile : piles) {      // To find the maximum element in the array
            if (pile > high){
                high = pile;
            }   
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEatAll(piles, mid, h)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static boolean canEatAll(int[] piles, int hourly, int h) {
        long totalH = 0;
        for (int pile : piles) {
            totalH += (pile + (long)hourly - 1) / speed;
            if (totalH > h) return false; // early exit
        }
        return true;
    }
}
