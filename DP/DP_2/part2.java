package DP.DP_2;
import java.util.*;

public class part2 {
    //0-1 knapsack recursion code
    public static int knapsack(int val[],int wt[],int W,int n){
        if (W==0 || n==0) {
            return 0;
        }
        if (wt[n-1]<= W) {
            //include
           int ans1=val[n-1]+ knapsack(val, wt, W-wt[n-1], n-1);
           //exclude
           int ans2=knapsack(val, wt, W, n-1);
           return Math.max(ans1, ans2);
            
        }else{
            return knapsack(val, wt, W, n-1);
        }
    }

//0-1 knapsack using memoization   T.C(n*w)
 public static int knapsack(int val[],int wt[],int W,int n,int dp[][]){
        if (W==0 || n==0) {
            return 0;
        }
        if (dp[n][W] !=-1) {
            return dp[n][W];
            
        }
        if (wt[n-1]<= W) {
            //include
           int ans1=val[n-1]+ knapsack(val, wt, W-wt[n-1], n-1,dp);
           //exclude
           int ans2=knapsack(val, wt, W, n-1,dp);
           dp[n][W]=Math.max(ans1, ans2);
           return dp[n][W];
            
        }else{
            dp[n][W]= knapsack(val, wt, W, n-1);
            return dp[n][W];
        }
    }

    //0-1 knapsack using tabulation
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int knapsackTab(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;

        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;

        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int V=val[i-1];
                int w=wt[i-1];
                if (w<=j) {//valid
                    int includeprofit=V+dp[i-1][j-w];
                    int excludeProfit=dp[i-1][j];
                    dp[i][j]=Math.max(includeprofit, excludeProfit);   
                }else{
                    int excludeProfit=dp[i-1][j];
                    dp[i][j]= excludeProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }



    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        //System.out.println(knapsack(val, wt, W, val.length,dp));
        System.out.println(knapsackTab(val, wt, W));
        
    }
    
}
