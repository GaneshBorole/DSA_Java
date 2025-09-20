package DP.DP_6;
import java.util.*;

public class MCM {
    public static int mcmRec(int arr[],int i,int j){
        if (i== j) {
            return 0;//single matrics case
        }
        int ans=Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {
            int cost1=mcmRec(arr, i, k);// res=arr[i-1].arr[k];
            int cost2=mcmRec(arr, k+1, j);// res=arr[k].arr[j];
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finaalCost=cost1+cost2+cost3;
            ans=Math.min(ans, finaalCost);

            
        }
        return ans;
    }
    //MCM using Memoization
    public static int mcmMemo(int arr[],int i,int j,int dp[][]){
        if (i==j) {
            return 0;
        }
        if (dp[i][j]!= -1) {
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
         for (int k = i; k <= j-1; k++) {
            int cost1=mcmMemo(arr, i, k,dp);// res=arr[i-1].arr[k];
            int cost2=mcmMemo(arr, k+1, j,dp);// res=arr[k].arr[j];
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finaalCost=cost1+cost2+cost3;
            ans=Math.min(ans, finaalCost);

            
        }
        return dp[i][j]=ans;


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n= arr.length;
        //System.out.println(mcmRec(arr, 1, n-1));
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
       System.out.println(mcmMemo(arr, 1, n-1, dp));
        
    }
    
}
