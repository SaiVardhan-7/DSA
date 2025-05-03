// class Solution {
//     public List<List<Integer>> fourSum(int[] arr, int target) {
//         int n = arr.length;
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(arr);

//         for(int i=0;i<n;i++){
//             if(i>0 && arr[i]==arr[i-1])   continue;
//             for(int j=i+1;j<n;j++){
//                 if(j>i+1 && arr[j]==arr[j-1])   continue;
//                 int k = j+1;
//                 int l = n-1;
//                 while(k<l){
//                     long sum = arr[i];
//                     sum += arr[j];
//                     sum += arr[k];
//                     sum += arr[l];
//                     if(sum==target){
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(arr[i]);
//                         temp.add(arr[j]);
//                         temp.add(arr[k]);
//                         temp.add(arr[l]);
//                         ans.add(temp);

//                         k++;
//                         l--;
//                         while(k<l && arr[k]==arr[k-1])   k++;
//                         while(k<l && arr[l]==arr[l+1])   l--;
//                     }
//                     else if(sum<target){
//                         k++;
//                     }
//                     else{
//                         l--;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }


// More efficient code
import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        if (n < 4) return result;

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            // Early termination
            if ((long) arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] > target) break;
            if ((long) arr[i] + arr[n - 1] + arr[n - 2] + arr[n - 3] < target) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                // Early termination
                if ((long) arr[i] + arr[j] + arr[j + 1] + arr[j + 2] > target) break;
                if ((long) arr[i] + arr[j] + arr[n - 1] + arr[n - 2] < target) continue;

                int k = j + 1, l = n - 1;

                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum == target) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));

                        // Skip duplicates
                        while (k < l && arr[k] == arr[k + 1]) k++;
                        while (k < l && arr[l] == arr[l - 1]) l--;

                        k++;
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return result;
    }
}
