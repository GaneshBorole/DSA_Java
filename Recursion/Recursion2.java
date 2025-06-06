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


    //remove Duplicates in String
    public static void removeduplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;

        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeduplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeduplicates(str, idx+1, newStr.append(currChar), map);
        }
    }


    //Friends pairing Problem
    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=friendspairing(n-1);//single
        int fnm2=friendspairing(n-2);//pairing
        int pairways=(n-1)*fnm2;
        
        //totalways
        int totalways=fnm1+pairways;
        return totalways;

    }

    //Binary string problem

    public static void BinaryString(int n, int lastPlace, String str) {
        // Base case: if n == 0, we have a valid binary string
        if (n == 0) {
            System.out.println(str);
            return; 
        }
    
        // Append '0' and make recursive call
        BinaryString(n - 1, 0, str + "0");
    
        // Only append '1' if last placed digit was not 1
        if (lastPlace == 0) {
            BinaryString(n - 1, 1, str + "1");
        }
    }
    

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        //  System.out.println("enter the n");
        // int n= sc.nextInt();
        // System.out.println("Total ways to tile 2 x " + n + " board: " + TailingProblem(n));
    //     String str="apnnnacollege";
    //   removeduplicates(str, 0, new StringBuilder(" "), new boolean[26]);
        // System.out.println(friendspairing(n));
        BinaryString(3,0," ");
       
    }
    
}
