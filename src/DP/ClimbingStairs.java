package DP;
import java.util.*;
public class ClimbingStairs {

        static int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int[] dp = new int[n];   // memo array
            Arrays.fill(dp, -1);     // initialize with -1

            return Math.min(minCost(0, cost, dp), minCost(1, cost, dp));
        }

        private static int minCost(int i, int[] cost, int[] dp) {
            if (i >= cost.length) return 0;
            if (dp[i] != -1) return dp[i];  // already computed

            dp[i] = cost[i] + Math.min(minCost(i+1, cost, dp), minCost(i+2, cost, dp));
            return dp[i];
        }



//    static int minCostClimbingStairs(int[] cost){
//        return Math.min(minCost(0,cost),minCost(1,cost));
//    }
//    private  static int minCost(int i,int[] cost){
//        if(i>=cost.length) return 0;
//        return cost[i]+Math.min(minCost(i+1,cost),minCost(i+2,cost));
//    }
}
