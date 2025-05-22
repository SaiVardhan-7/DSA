// XOR METHOD IS USED FOR BOTH SORTED AND UNSORTED ARRAY
// class Solution {
//     public int singleNonDuplicate(int[] arr) {
//         int n = arr.length;
//         int ans = 0;
//         for(int i=0;i<n;i++){
//             ans = ans^arr[i];
//         }
        
//         return ans;
//     }
// }

// SINCE THE ARRAY IS SORTED WE CAN APPLY BINARY SEARCH CONCEPT FOR BETTER 
// TIME COMPLEXITY O(logn)
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n==1)   return arr[0];
        if(arr[0]!=arr[1])   return arr[0];
        if(arr[n-1]!=arr[n-2])   return arr[n-1];

        int low = 1, high = n-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }

            if((mid%2==1 && arr[mid-1]==arr[mid]) || (mid%2==0 && arr[mid]==arr[mid+1])){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }
}
