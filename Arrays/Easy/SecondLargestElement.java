import java.util.*;

class Solution {
    public static int secondLargestElement(int[] arr) {
        if(arr.length<2)   return -1;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : arr){
            if(max1<num){
                max2 = max1;
                max1 = num;
            }
            else if(max2<num && num!=max1){
                max2 = num;
            }
        }

        return (max2==Integer.MIN_VALUE) ? -1 : max2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(secondLargestElement(arr));
    }
}
