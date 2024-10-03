import java.util.*;
public class ClimbingSteps {
    public static int ways(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return ways(n, memo); 
    }
    public static int ways(int n, int[] memo){
        if(n < 0) {
            return 0;
        }
        else if(memo[n] != -1) {
            return memo[n];
        }
        else if(n == 0) {
            memo[n] = 1;
            return 1;
        }else{
            int ans = ways(n-1) + ways(n-2);
            memo[n] = ans;
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(ways(n));
        sc.close();
    }
}
