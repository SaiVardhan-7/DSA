class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0, col = m-1;
        while(row<n && col>=0){
            int current = matrix[row][col];
            if(current == target){
                return true;
            }
            else if(current < target){
                row++;
            }
            else{
                col--;
            }
        }
        
        return false;
    }
}
