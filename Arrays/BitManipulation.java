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
        // public static int clearIthbit(int n, int i){
        //     int bitmask= ~1<<i;
        //     return n & bitmask;
        // }
        //update ith bit
        public static int updateIthbit(int n,int i,int newbit){
        //   if( newbit == 0){
        //     return clearIthbit(n, i);
        //   }else{
        //     return setIthbit(n, i);
        //   }
        n=clearIthbit(n, i);
        int bitmask= newbit << i;
        return n|bitmask;
        }

        public static int clearIthbit(int n,int i){ //we clear the last two digits
            int bitmask=(~0)<<i;
            return n & bitmask;

        }
        public static int clearBitsInRange(int n,int i,int j){
            int a=((~0)<<(j+1));
            int b=(1<<i)-1;
            int bitmask=a | b;
            return n & bitmask;
        }
        public static boolean ispowerOfTWo(int n){
            return (n & (n-1))==0;
        }



        public static int countsetBit(int n){
            int count =0;
            while (n > 0) {
                if((n & 1)!=0){
                    count++;
                }
                n=n>>1;

                
            }
            return count;
        }

        public static int fastExpo(int n,int a){
            int ans=1;
            while (n > 0) {
                if((n&1)!= 0){
                    ans = ans*a;
                }
                a = a*a;
                n = n>>1;
                
            }
            return ans;
        }
    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 ^ 6);
        // System.out.println(5<<2);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int n= sc.nextInt();
        // System.out.println("enter the i  Bit");
        // int i= sc.nextInt();
        // System.out.println("enter j");
        // int j=sc.nextInt();
        System.out.println("enter a");
        int a=sc.nextInt();

        // System.out.println("enter the newbit");
        // int newbit=sc.nextInt();
        // OddorEven(n);
        System.out.println("ith bit is :");
        // System.out.println(getIthbit(n, i));
        // System.out.println(setIthbit(n, i));
        // System.out.println(clearIthbit(n, i));
        // System.out.println(updateIthbit(n, i, newbit));
        // System.out.println(clearIthbit(n, i));
        // System.out.println(clearBitsInRange(n, i, i));
        // System.out.println(ispowerOfTWo(n));
        // System.out.println(countsetBit(n));
        System.out.println(fastExpo(n, a));
    }
    
}
