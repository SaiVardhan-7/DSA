class Solution {
    public static int upperBound(int []arr,int col, int x){
        int low = 0 , high = col-1;
        int ans = col;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>x){
                ans = mid;    // Here ans gives the no.of smaller numbers before median
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int countSmallEquals(int [][]matrix, int row, int col, int x){
        int count = 0;
        for(int i=0;i<row;i++){
            count += upperBound(matrix[i],col,x);
        }

        return count;
    }
    
    public static int findMedian(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            low = Math.min(low,matrix[i][0]);
            high = Math.max(high,matrix[i][col-1]);
        } 

        int req = (row*col)/2;
        while(low<=high){
            int mid = low+(high-low)/2;
            int smallEquals = countSmallEquals(matrix,row,col,mid);
            if(smallEquals<=req){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return low;
    }
}
