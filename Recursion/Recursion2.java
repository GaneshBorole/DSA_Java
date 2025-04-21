package Recursion;
import java.util.*;

public class Recursion2 {
    //Tailing Problem
    public static int TailingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fnm1=TailingProblem(n-1);//for vetical tiles
        int fnm2=TailingProblem(n-2);//for horizontal tiles

        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the n");
        int n= sc.nextInt();
        System.out.println("Total ways to tile 2 x " + n + " board: " + TailingProblem(n));
       
    }
    
}
