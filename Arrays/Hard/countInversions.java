class Solution {
    public static int mergeSort(int arr[], int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        int count = 0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }
            else{
                count += (mid - left + 1);
                temp.add(arr[right++]);
            }
        }

        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }

        return count;
    }
    public static int divide(int arr[], int low, int high){
        int count = 0;
        if(low>=high){
            return count;
        }

        int mid = low + (high-low)/2;
        count += divide(arr,low,mid);
        count += divide(arr,mid+1,high);
        count += mergeSort(arr,low,mid,high);
        
        return count;
    }
    public static long numberOfInversions(int[] arr) {
        int n = arr.length;
        
        int[] tempArr = arr.clone();
        long count = divide(tempArr, 0, n - 1);

        return count;
    }
}
