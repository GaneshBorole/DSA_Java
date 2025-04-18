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
        if(n == 1){
            System.out.print(1);
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        // printDesc(n);
        printInc(n);
    }
    
}
