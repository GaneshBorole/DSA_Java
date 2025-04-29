package Backtracking;
import java.util.*;

public class Backtracking {
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
    public static void main(String[] args) {
        int arr[]=new int[5];
        changearr(arr, 0, 1);
        printarr(arr);
        
    }
    
}
