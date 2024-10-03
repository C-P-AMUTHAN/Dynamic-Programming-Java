import java.util.*;
public class FibonacciSeries {
    public static int fib(int n, int[] memo) {
        if(memo[n] != -1) {
            return memo[n];
        }
        else if( n==0 || n==1) {
            int ans = n;
            memo[n] = ans;
            return ans;
        }
        else {
            int ans = fib(n-1, memo) + fib(n-2, memo);
            memo[n] = ans;
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        int result = fib(n, memo);
        System.out.println(result);
        System.out.println(Arrays.toString(memo));
        sc.close();
    }
}
