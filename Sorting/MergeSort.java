import java.util.*;

class MergeSort {
    static int[] temp;

    public static void mergeSort(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int idx = low;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            } else {
                temp[idx++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[idx++] = arr[left++];
        }

        while (right <= high) {
            temp[idx++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }

    public static void divide(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        mergeSort(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        temp = new int[n]; // global temp array

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
