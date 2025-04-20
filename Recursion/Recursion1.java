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
//calculate factorial of a number
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=Fact(n-1);
        int fn=n* Fact(n-1);
        return fn;
    }
    //calculate sum of natural numbers
    public static int sum (int n){
        if(n == 1){
            return 1;
        }
        int abc=sum(n-1);
        int sm=n+sum(n-1);
        return sm;
    }
    //calculate Fibonacci number

    public static int fibonacci(int n){
        if(n==0 || n==1 ){
            return n;
        }
        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    //print if a array is sorted or not
    public static boolean sorted(int arr [],int i){
        if(i == arr.length-1){
            return true;
        };
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted(arr,i+1);

    }
    //find first occurence of a number
    public static int firstOccurence(int arr[],int key,int i){
        if(i== arr.length-1){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return firstOccurence(arr, key, i+1);

    }
    //find last occurence of number in given array
    public static int lastoccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastoccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    //calculate power 
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        int xnm1=power(x, n-1);
        int xn=x* xnm1;
        return xn;
    }


    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
    //   System.out.println("enter n");
    //   int n=sc.nextInt();


        // printDesc(n);
        // printInc(n);
        // System.out.println(Fact(n));
        // System.out.println(sum(n));
        //System.out.println(fibonacci(n));
        //int arr []={1,2,5,4,5,3};
        // System.out.println(sorted(arr, 0));
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastoccurence(arr, 5, 0));
        System.out.println(power(3, 2));
    }
    
}
