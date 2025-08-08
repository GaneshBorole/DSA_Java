package DP.DP_1;
import java.util.*;



public class part1 {
//1.fibonacci using Memoization
    public static int  fib(int n,int f [] ){
        if (n== 0 || n== 1) {
            return n;
            
        }
        if (f[n] !=0) {
            return f[n];
        }
        f[n]= fib(n-1,f)+ fib(n-2,f);
        return f[n];
    }

    // 2.fibonacci using Tabulation
    public static int fibTabulation(int n){
    int dp[]=new int[n+1];
    dp[0]=0;
    dp[1]=1;
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
}

//2.climbing Stairs problem using memoization
public static int climbingstairs(int n,int ways []){
    //memoization -->O(n)
    if (n==0) {
        return 1;
    }
    if (n < 0) {
        return 0;
    }
    if (ways[n]!= -1) {
        return ways[n];
        
    }
    ways[n]= climbingstairs(n-1,ways)+climbingstairs(n-2,ways);
    return ways[n];
}


//climbing stairs using tabulation 
//time complexity O(n)
public static int climbStairTab(int n){
    int dp []= new int[n+1];
    dp[0]=1;

    for(int i=1;i<=n;i++){
        if(i == 1){
            dp[i]=dp[i-1]+0;
        }else{
        dp[i]=dp[i-1]+dp[i-2];
        }
     
    }
    return dp[n];

}
    public static void main(String[] args) {
        int n=5;
       // int f[]=new int[n+1];
       int ways[]=new int[n+1];
        Arrays.fill(ways, -1);
        //System.out.println(fib(n,f));
        System.out.println(fibTabulation(n));
        System.out.println(climbingstairs(n,ways));
        System.out.println(climbStairTab(n));
        
    }
    
}
