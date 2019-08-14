package algorithmn;

/**
 * @author: liuxs
 * @description:  爬楼梯算法
 * @date: Created in 2:29 PM  2019/7/7
 */
public class StairSolution {


    public static int climbStairs(int n){
        if(n < 1){
            return 0;
        }
        if(n < 4){
           return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


    public static void main(String args[]){
        System.out.println(climbStairs(4));
    }
}
