class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m-1;
        int j = n-1;
        int idx = m+n-1;

        // while(i>=0 && j>=0){
        //     if(arr1[i]<arr2[j]){
        //         arr1[idx] = arr2[j];
        //         j--;
        //     }
        //     else{
        //         arr1[idx] = arr1[i];
        //         i--;
        //     }
        //     idx--;                             
        // }
        // Copy remaining elements from arr2, if any
        // while(j>=0){
        //     arr1[idx] = arr2[j];
        //     j--;
        //     idx--;
        // }

        while(j>=0){       // Both of them logic is same but this is cleaner and easy
            arr1[idx--] = (i>=0 && arr1[i]>arr2[j]) ? arr1[i--] : arr2[j--];
        }

    }
}
