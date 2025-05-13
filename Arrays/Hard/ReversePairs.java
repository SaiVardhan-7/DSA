class Solution {
    static int temp[];
    public static void mergeSort(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid+1;
        int idx = low;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            } else {
                temp[idx++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[idx++] = arr[left++];
        }

        while (right <= high) {
            temp[idx++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }
    public static int divide(int arr[], int low, int high){
        int count = 0;
        if(low>=high){
            return count;
        }
        int mid = low + (high-low)/2;
        count += divide(arr,low,mid);
        count += divide(arr,mid+1,high);
        count += countPairs(arr,low,mid,high);

        if (arr[mid] <= arr[mid + 1]){
            return count;
        } 
           
        mergeSort(arr,low,mid,high);

        return count;
    }
    public static int countPairs(int arr[], int low, int mid, int high){
        int count = 0;
        int right = mid+1;

        for(int i=low;i<=mid;i++){
            while(right<=high && (long)arr[i] > 2L*arr[right]){
                right++;
            }
            count += right-(mid+1);
        }

        return count;
    }
    public static int reversePairs(int[] nums) {
        int n = nums.length;
        temp = new int[n];
        int arr[] = nums.clone();
        int count = divide(arr,0,n-1);

        return count;
    }
}


// This code is something better than above code in terms of runtime 

// class Solution {
//     private int mergeSort(int[] nums, int[] temp, int low, int high) {
//         if (low >= high) return 0;

//         int mid = low + (high - low) / 2;
//         int count = 0;

//         count += mergeSort(nums, temp, low, mid);
//         count += mergeSort(nums, temp, mid + 1, high);

//         // Count reverse pairs
//         int j = mid + 1;
//         for (int i = low; i <= mid; i++) {
//             while (j <= high && (long) nums[i] > 2L * nums[j]) {
//                 j++;
//             }
//             count += j - (mid + 1);
//         }

//         // Optimization: skip merge if already sorted
//         if (nums[mid] <= nums[mid + 1]) return count;

//         // Merge the sorted halves
//         merge(nums, temp, low, mid, high);

//         return count;
//     }
//     private void merge(int[] nums, int[] temp, int low, int mid, int high) {
//         System.arraycopy(nums, low, temp, low, high - low + 1);

//         int i = low, j = mid + 1, k = low;

//         while (i <= mid && j <= high) {
//             if (temp[i] <= temp[j]) {
//                 nums[k++] = temp[i++];
//             } else {
//                 nums[k++] = temp[j++];
//             }
//         }

//         while (i <= mid) {
//             nums[k++] = temp[i++];
//         }

//         // No need to copy the right half (already in place)
//     }
//     public int reversePairs(int[] nums) {
//         int[] temp = new int[nums.length];
//         return mergeSort(nums, temp, 0, nums.length - 1);
//     }
// }
