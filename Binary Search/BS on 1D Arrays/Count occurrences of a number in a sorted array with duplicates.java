class Solution {
  // Same as that of [Find First and Last Position of Element in Sorted Array]
    public static int firstPosition(int[] arr, int target, int n){
        int low = 0, high = n-1;
        int first = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return first;
    }
    public static int lastPosition(int[] arr, int target, int n){
        int low = 0, high = n-1;
        int last = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return last;
    }
    public static int count(int[] arr, int target) {
        int n = arr.length;
        int first = firstPosition(arr,target,n);
        if(first==-1)   return 0;
        int last = lastPosition(arr,target,n);
        int count = last-first+1;

        return count;
    }
}

// BY USING THE CONCEPT OF LOWER BOUND AND UPPER BOUND
// class Solution {
//     public static int lowerBound(int[] arr, int target, int n){
//         int low = 0, high = n-1;
//         int lb = n;
//         while(low<=high){
//             int mid = low+(high-low)/2;
//             if(arr[mid]>=target){
//                 lb = mid;
//                 high = mid - 1;
//             }
//             else{
//                 low = mid + 1;
//             }
//         }
//         return lb;
//     }
//     public static int upperBound(int[] arr, int target, int n){
//         int low = 0, high = n-1;
//         int ub = n;
//         while(low<=high){
//             int mid = low+(high-low)/2;
//             if(arr[mid]>target){
//                 ub = mid;
//                 high = mid - 1;
//             }
//             else{
//                 low = mid + 1;
//             }
//         }
//         return ub;
//     }
//     public static int[] count(int[] arr, int target){
//         int n = arr.length;
//         int lb = lowerBound(arr,target,n);
//         if(lb==n || arr[lb]!=target)   return 0;
//         int ub = upperBound(arr,target,n);
//         int count = ub-lb+1;
//
//         return count;
//     }
// }
