class Solution {
    // Find the index of the max element in a specific column
    public static int findMaxRow(int[][] mat, int rows, int col) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < rows; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col];
                index = i;
            }
        }

        return index;
    }

    public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0, high = cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int maxRow = findMaxRow(mat, rows, mid);

            int left = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1;
            int right = (mid + 1 < cols) ? mat[maxRow][mid + 1] : -1;

            if (mat[maxRow][mid] > left && mat[maxRow][mid] > right) {
                return new int[] { maxRow, mid };
            } else if (mat[maxRow][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] { -1, -1 }; // Should never reach here due to constraints
    }
}
