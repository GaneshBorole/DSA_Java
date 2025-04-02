package Arrays;
import java.util.*;

public class Array2 {
    // Max Subarray Sum-->Brute Force
    // public static void MaxofSubArray(int numbers[]){
    //     //start=i;
    //     //end=j;

    //     int currSum=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i=0; i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             currSum=0;
    //             for(int k=i;k<=j;k++){
    //                 currSum +=numbers[k];
    //             }
    //             System.out.println(currSum);
    //             if(maxSum < currSum){
    //                 maxSum=currSum;
    //             }
             
    //         }
            
    //     }
    //     System.out.println("Max sum is "+maxSum);
    // }

    // Method 2 -->Prefix Sum
    // public static void MaxofSubArray(int numbers[]){
    //     //start=i;
    //     //end=j;
    //     int currSum=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     int prefix[]=new int[numbers.length];

    //     prefix[0]=numbers[0];
    //     for(int i=1;i<prefix.length;i++){
    //         prefix[i]=prefix[i-1]+numbers[i];
    //     }

    //     for(int i=0; i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             currSum= i==0 ? prefix[j]:prefix[j]-prefix[i-1];
    //             if(maxSum < currSum){
    //                 maxSum=currSum;
    //             }
             
    //         }
            
    //     }
    //     System.out.println("Max sum is "+maxSum);
    // }


    //Method 3 ---> Kadane's algorithm

//     public static void Kadanes(int numbers[]){
//         int MaxSum=Integer.MIN_VALUE;
//         int currSum=0;

//         for(int i=0;i<numbers.length;i++){
//             currSum=currSum+numbers[i];
//             if(currSum < 0){
//                 currSum=0;
//             }
//             MaxSum=Math.max(currSum, MaxSum);
//         }
//         System.out.println("max sum subarray is :"+MaxSum);

//     }
//     public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//             System.out.println("enter the size");
//             int size= sc.nextInt();
//             int numbers[]=new int [size];
//             System.out.println("enter element ");
//             for(int i=0;i<numbers.length;i++){
//                 numbers[i]=sc.nextInt();
//             }
//         Kadanes(numbers);
// }
 

   //Trapped Rain Water problem

// public static int TrappedRainWater(int heights[]) {
//     // Base case: If there are less than 3 elements, no water can be trapped
//     if (heights == null || heights.length < 3) {
//         return 0;
//     }

//     int n = heights.length;
    
//     // Calculate leftMax boundary
//     int leftmax[] = new int[n];
//     leftmax[0] = heights[0];
//     for (int i = 1; i < n; i++) { // Start from i = 1
//         leftmax[i] = Math.max(heights[i], leftmax[i - 1]);
//     }

//     // Calculate rightMax boundary
//     int rightmax[] = new int[n];
//     rightmax[n - 1] = heights[n - 1];
//     for (int i = n - 2; i >= 0; i--) { // Fix loop condition
//         rightmax[i] = Math.max(heights[i], rightmax[i + 1]);
//     }

//     // Calculate trapped water
//     int trappedWater = 0;
//     for (int i = 0; i < n; i++) {
//         int waterlevel = Math.min(leftmax[i], rightmax[i]);
//         trappedWater += waterlevel - heights[i];
//     }

//     return trappedWater; // Fix return statement
// }
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     System.out.println("enter the size of array");
//     int size= sc.nextInt();
//     int heights[]=new int [size];
//     System.out.println("enter heights of bars");
//     for(int i=0; i<heights.length;i++){
//         heights[i]=sc.nextInt();
//     }
//     System.out.println("Trapped rainwater is "+TrappedRainWater(heights));

// }

public static int BuyAndCell(int prices[]){
    int buyprice=Integer.MAX_VALUE;
    int maxProfit=0;

    for(int i=0;i<prices.length;i++){
        if(buyprice < prices[i]){ //profit
            int profit=prices[i]-buyprice; //todays profit
            maxProfit=Math.max(maxProfit, profit);
        }else{
            buyprice=prices[i];

        }
    }
    return maxProfit;
}

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of array");
    int size= sc.nextInt();
    int prices[]=new int[size];
    System.out.println("enter prices in array");
    for(int i=0;i<prices.length;i++){
        prices[i]=sc.nextInt();
    }
    System.out.println("max profit is "+BuyAndCell(prices));
}

}

    

