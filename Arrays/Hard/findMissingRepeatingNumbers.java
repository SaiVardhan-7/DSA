class Solution {
    public int[] findMissingRepeatingNumbers(int[] arr) {
        int n = arr.length;
        long Sn = (long) (n * (n + 1)) / 2;
        long S2n = (long) (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += (long)arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }

        long diff = S - Sn;          // A - B
        long sqDiff = S2 - S2n;      // A^2 - B^2

        long sum = sqDiff / diff;    // A + B

        int A = (int)((diff + sum) / 2);  // Repeating
        int B = (int)(A - diff);          // Missing

        return new int[]{A, B};
    }
}
