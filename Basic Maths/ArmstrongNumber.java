import java.util.*;

class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int N = n;
        int Nn = n;
        int count = 0;
        while(n!=0){
            n /= 10;
            count++;
        }

        int sum = 0;
        while(N!=0){
            int r = N%10;
            sum += (int)Math.round(Math.pow(r,count));  //Math.pow returns double value
            N = N/10;
        }

        if(sum==Nn)    return true;
        else           return false; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
}