package Arrays;
import java.util.*;


public class BasicSorting {

    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }

        }


    }
    public static void PrintArr(int arr[]){
        System.out.println("Sorted array is: ");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

         }
         System.out.println();
        
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of array");
    int size= sc.nextInt();
    int arr[]=new int [size];
    System.out.println("enter the element in array");
    for(int i=0; i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    bubbleSort(arr);
    PrintArr(arr);
       
    
}
}