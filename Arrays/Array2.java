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

    public static void Kadanes(int numbers[]){
        int MaxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<numbers.length;i++){
            currSum=currSum+numbers[i];
            if(currSum < 0){
                currSum=0;
            }
            MaxSum=Math.max(currSum, MaxSum);
        }
        System.out.println("max sum subarray is :"+MaxSum);

    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
            System.out.println("enter the size");
            int size= sc.nextInt();
            int numbers[]=new int [size];
            System.out.println("enter element ");
            for(int i=0;i<numbers.length;i++){
                numbers[i]=sc.nextInt();
            }
        Kadanes(numbers);
}
  

    
}
    

