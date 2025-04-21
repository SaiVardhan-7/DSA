import java.util.*;

// Leetcode - 9. Palindrome Number
class PalindromeCheck {
    public static boolean isPalindrome(int n) {
        // Negative numbers and numbers ending with 0 (except 0 itself) aren't
        // palindromes
        if (n < 0 || (n % 10 == 0 && n != 0))
            return false;

        int N = n;
        int reverse = 0;
        while (n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        if (reverse == N)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
