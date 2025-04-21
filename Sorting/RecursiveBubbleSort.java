import java.util.*;

class RecursiveBubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        if (n == 1)
            return;

        int didSwap = 0;

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }
        }

        if (didSwap == 0)
            return;

        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
