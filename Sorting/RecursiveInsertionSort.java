import java.util.*;

class RecursiveInsertionSort {
    public static void insertionS(int[] arr, int n) {
        if (n <= 1)
            return;

        insertionS(arr, n - 1);

        int key = arr[n - 1];
        int j;
        for (j = n - 2; j >= 0 && arr[j] > key; j--) {
            arr[j + 1] = arr[j];
        }
        arr[j + 1] = key;
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

        insertionS(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}