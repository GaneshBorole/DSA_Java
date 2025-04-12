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

    public static int getIthbit(int n,int i){
        int bitmask= 1<< i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
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
        System.out.println(getIthbit(n, i));
    }
    
}
