import java.util.*;

class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        int i, j;
        for (i = 0; i < n - 1; i++) {
            int minI = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[minI]) {
                    minI = j;
                }
            }
            int temp = arr[minI];
            arr[minI] = arr[i];
            arr[i] = temp;
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

        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}