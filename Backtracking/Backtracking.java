package Backtracking;
import java.util.*;

public class Backtracking {
    //backtracking with array
    public static void changearr(int arr[],int i,int value){
    //base case
    if(i==arr.length){
        printarr(arr);
        return;
    }
 //recursion
        arr[i]=value;
        changearr(arr, i+1, value+1);//function call step
        arr[i]=arr[i]-2;//backtrack step
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //find subsets
    public static void  findsubsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            System.out.print(ans);
            return;
        }
        //recursion
        findsubsets(str, ans+str.charAt(i), i+1);
        //yes choice
        findsubsets(str, ans, i+1);

    }

    //find permutations
    public static void findpermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String rest=str.substring(0,i)+str.substring(i+1);
            findpermutations(rest, ans+curr);    
        }
    }
    public static void main(String[] args) {
        // int arr[]=new int[5];
        // changearr(arr, 0, 1);
        // printarr(arr);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String str=sc.nextLine();
        //findsubsets(str, " ", 0);
        findpermutations(str, "");


    }
    
    
}
