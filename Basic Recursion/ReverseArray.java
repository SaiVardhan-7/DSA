import java.util.Scanner;

class Solution {
    public static void reverse(int[] arr, int n) {
        // Corrected start and end
        reverseHelper(arr, n, arr.length - 1);
    }

    public static void reverseHelper(int[] arr, int start, int end) {
        if (start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseHelper(arr, start + 1, end - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0); // Start from index 0

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
