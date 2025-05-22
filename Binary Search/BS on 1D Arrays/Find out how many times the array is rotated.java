class Solution {
  // Using the concept of finding Minimum element in the Array
    public int findKRotation(ArrayList<Integer> arr){
        int n = arr.size();
        int low = 0, high = n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr.get(low)<=arr.get(high)){
                if(ans>arr.get(low)){
                    ans = arr.get(low);
                    index = low;
                }
                break;
            }

            if(arr.get(low)<=arr.get(mid)){
                if(ans>arr.get(low)){
                    ans = arr.get(low);
                    index = low;
                }
                low = mid + 1;
            }
            else{
                if(ans>arr.get(mid)){
                    ans = arr.get(mid);
                    index = mid;
                }
                high = mid - 1;
            }
        }

        return index;
    }
}
