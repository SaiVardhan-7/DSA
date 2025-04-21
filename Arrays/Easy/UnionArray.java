import java.sql.Time;
import java.util.*;

public class unionArray {
    // Method - 1
    public static int[] Union(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int temp[] = new int[n1 + n2];
        int idx = 0;
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                if (idx == 0 || temp[idx - 1] != arr1[i]) {
                    temp[idx++] = arr1[i];
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (idx == 0 || temp[idx - 1] != arr1[i]) {
                    temp[idx++] = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (idx == 0 || temp[idx - 1] != arr2[j]) {
                    temp[idx++] = arr2[j];
                }
                j++;
            }
        }

        while (i < n1) {
            if (idx == 0 || temp[idx - 1] != arr1[i]) {
                temp[idx++] = arr1[i];
            }
            i++;
        }

        while (j < n2) {
            if (idx == 0 || temp[idx - 1] != arr2[j]) {
                temp[idx++] = arr2[j];
            }
            j++;
        }

        return Arrays.copyOf(temp, idx);
    }

    // Method - 2
    // Using HASH MAPS
    public static int[] Union2(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Sort arrays if they are not sorted
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        // Convert List to int[]
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Method - 3
    // Most optimised version USING HASHSETS
    public static int[] UnionMethod3(int arr1[], int arr2[]) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }

        // Convert Set to int[]
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    // ✅ Time Complexity : O(n1 + n2)
    // ✅ Space Complexity : O(n1 + n2)

    // CONCLUSION
    // ✅ If arrays are already sorted, two-pointer merge is slightly faster and more
    // memory efficient.
    // ✅ If arrays are unsorted, HashSet method is more optimized overall (no
    // sorting needed, automatic duplicate removal).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of two arrays : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        System.out.print("Enter the elements of the first array : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the elements of the second array : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int arr[] = Union(arr1, arr2);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
