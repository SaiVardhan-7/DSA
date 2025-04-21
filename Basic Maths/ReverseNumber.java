import java.util.*;

class Solution {
    public static int reverse(int n) {
        int r = 0;
        while(n!=0){
            int rem = n%10;
            
            // check overflow condition        32-bit integer range [-2^31, 2^31 - 1]
            if(r>Integer.MAX_VALUE/10 || (r==Integer.MAX_VALUE/10 && rem>7)){
                return 0;
            }
            if(r<Integer.MIN_VALUE/10 || (r==Integer.MIN_VALUE/10 && rem<-8)){
                return 0;
            }
            
            r = r*10 + rem;
            n /= 10;
        }

        return r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
