package Arrays;
import java.util.*;

public class BitManipulation {
    // public static void OddorEven(int n){
    //     int bitmask=1;
    //     if(( n & bitmask) == 0){
    //         System.out.println("given number is even ");
    //     }else{
    //         System.out.println("given number is odd ");
    //     }

    // }


        //How to get ith Bit 

    // public static int getIthbit(int n,int i){
    //     int bitmask= 1<< i;
    //     if((n & bitmask)==0){
    //         return 0;
    //     }else{
    //         return 1;
    //     }
    // }
    

        //Set ith Bit
        public static int setIthbit(int n,int i){
            int bitmask= 1<< i;
            return n | bitmask;
        }

        //clear ith Bit
        public static int clearIthbit(int n, int i){
            int bitmask= ~1<<i;
            return n & bitmask;
        }
    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 ^ 6);
        // System.out.println(5<<2);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int n= sc.nextInt();
        System.out.println("enter the ith Bit");
        int i= sc.nextInt();
        // OddorEven(n);
        System.out.println("ith bit is :");
        // System.out.println(getIthbit(n, i));
        // System.out.println(setIthbit(n, i));
        System.out.println(clearIthbit(n, i));
    }
    
}
