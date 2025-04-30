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
    public static void main(String[] args) {
        // int arr[]=new int[5];
        // changearr(arr, 0, 1);
        // printarr(arr);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String str=sc.nextLine();
        findsubsets(str, " ", 0);


    }
    
    
}
