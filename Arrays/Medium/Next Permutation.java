class Solution {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;

        int pivot = -1;
        // step 1 -- To find breaking point
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        // If there is no breaking point
        if(pivot == -1){
            reverse(arr,0,n-1);
            return;
        }
        // step 2 -- find next greater element and swap
        for(int i=n-1;i>pivot;i--){
            if(arr[pivot]<arr[i]){
                swap(arr,pivot,i);
                break;
            }
        }
        // step 3 -- reverse the rest right half
        reverse(arr,pivot+1,n-1);
    }
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void reverse(int arr[], int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
