class Solution {
    // Time complexity : O(nlogm)
    public static int lowerBound(int []arr, int m, int x){
        int low = 0, high = m-1;
        int ans = m;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
    public static int rowWithMax1s(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        int countMax = 0;
        int index = -1;

        for(int i=0;i<n;i++){
            int count = m - lowerBound(mat[i],m,1);
            if(countMax<count){
                countMax = count;
                index = i;
            }
        }
        
        return index;
    }
}

// Optimal solution
// Time complexity O(n+m)
// class Solution {
//     public static int rowWithMax1s(int[][] mat) {
//         int n = mat.length;
//         int m = mat[0].length;

//         int maxRowIndex = -1;
//         int j = m - 1;

//         for (int i = 0; i < n; i++) {
//             while (j >= 0 && mat[i][j] == 1) {
//                 j--;
//                 maxRowIndex = i;
//             }
//         }

//         return maxRowIndex;
//     }
// }
