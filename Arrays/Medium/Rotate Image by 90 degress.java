class Solution {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j,j,i);
            }
        }

        // Reverse each row of the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                swap(matrix,i,j,i,n-1-j);
            }
        }
    }
    public static void swap(int matrix[][], int a, int b, int c, int d){
        int temp = matrix[a][b];
        matrix[a][b] = matrix[c][d];
        matrix[c][d] = temp;
    }
}
