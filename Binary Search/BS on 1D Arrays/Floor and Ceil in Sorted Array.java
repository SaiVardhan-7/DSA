class Solution {
    public int[] getFloorAndCeil(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return new int[]{x, x}; // x is both floor and ceil
            } else if (arr[mid] < x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }
}
