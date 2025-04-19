package Recursion;
import java.util.*;

public class Recursion1 {
    public static void printDesc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDesc(n-1);
    }

    public static void printInc(int n){
        if(n == 0){
            System.out.print(1);
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }

    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=Fact(n-1);
        int fn=n* Fact(n-1);
        return fn;
    }
    public static int sum (int n){
        if(n == 1){
            return 1;
        }
        int abc=sum(n-1);
        int sm=n+sum(n-1);
        return sm;
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter n");
      int n=sc.nextInt();
        // printDesc(n);
        // printInc(n);
        // System.out.println(Fact(n));
        System.out.println(sum(n));
    }
    
}
