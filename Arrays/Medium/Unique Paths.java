class Solution {
    public int uniquePaths(int m, int n) {
        int N = m+n-2;       // Total no.of directions in a path
        int r = n-1;         // or m-1 (no.of rights or no.of downs in a path)
        double result = 1;

        // To find total no.of paths
        for(int i=1;i<=r;i++){          // To find Ncr (no.of combinations)
            result = result*(N-r+i)/i;
        }

        return (int)result;
    }
}

// Brute Force Approach
// int countPaths(int i, int j, int n, int m){
//   if(i==(n-1) && j==(m-1))   return 1;
//   if(i>=n || j>=m)   return 0;
//   else return countPaths(i+1,j,n,m) + countPaths(i,j+1,n,m);
// }


// Better Approach
// int countPaths(int i, int j, int n, int m, int[][] dp){
//   if(i==(n-1) && j==(m-1))   return 1;
//   if(i>=n || j>=m)   return 0;
//   if(dp[i][j] != -1) return dp[i][j];
//   else return dp[i][j] = countPaths(i+1,j,n,m,dp) + countPaths(i,j+1,n,m,dp);
// }
