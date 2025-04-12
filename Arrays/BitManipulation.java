package Arrays;
import java.util.*;

public class BitManipulation {
    public static void OddorEven(int n){
        int bitmask=1;
        if(( n & bitmask) == 0){
            System.out.println("given number is even ");
        }else{
            System.out.println("given number is odd ");
        }

    }
    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 ^ 6);
        // System.out.println(5<<2);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int n= sc.nextInt();
        OddorEven(n);
    }
    
}
