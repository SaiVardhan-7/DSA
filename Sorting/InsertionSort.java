import java.util.*;

class InsertionSort {
    public static int[] insertionS(int[] arr) {
        int i, j;
        int n = arr.length;
        for (i = 1; i < n; i++) {
            int key = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }

        return arr;
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

        insertionS(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}