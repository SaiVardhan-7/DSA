class Solution {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;

        // int temp[] = new int[n];
        // for(int i=0;i<n;i++){
        //     temp[(i+k)%n] = arr[i];    // Uses extra space so Space complexity : O(n)
        // }
        // for(int i=0;i<n;i++){
        //     arr[i] = temp[i];
        // }

        reverse(arr, 0, n-1);      // Reverse total array
        reverse(arr, 0, k-1);      // Reverse upto k-1
        reverse(arr, k, n-1);      // Reverse k to n-1
    }
    private static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
// Time complexity : O(n)
// Space complexity : O(1)
