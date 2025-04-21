import java.util.*;

// It won't work for negative numbers
public class LongestSubArray {
    public static int getLongestSubArrayLength(int arr[], int target) {
        int n = arr.length;
        int left = 0, right = 0;
        int maxLen = 0;
        int sum = arr[0];

        while (right < n) {
            while (left <= right && sum > target) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += arr[right];
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        int length = getLongestSubArrayLength(arr, target);
        System.out.println(length);
    }
}
