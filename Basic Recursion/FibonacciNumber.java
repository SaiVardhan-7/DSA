import java.util.*;

// Leetcode - 509. Fibonacci Number
class FibonacciNumber {
    public static int fib(int n) {
        // if(n<=1) return n;
        // return fib(n-1) + fib(n-2); Runtime : 6ms

        if (n <= 1)
            return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b; // Runtime : 0ms
            b = a + b;
            a = temp;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n' : ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}