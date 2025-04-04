package Arrays;
import java.util.*;


public class BasicSorting {

    // public static void bubbleSort(int arr[]){
    //     for(int turn=0; turn<arr.length-1;turn++){
    //         for(int j=0;j<arr.length-1-turn;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1]= temp;
    //             }
    //         }

    //     }


    // }
    // public static void PrintArr(int arr[]){
    //     System.out.println("Sorted array is: ");
    //      for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");

    //      }
    //      System.out.println();
        
    // }


    // selection Sort


    // public static void  selectionSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int minPosition=i;
    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[minPosition] > arr[j]){
    //             minPosition = j;
                
    //         }
    //     }
    //     //swap
    //     int temp=arr[minPosition];
    //     arr[minPosition]=arr[i];
    //     arr[i]=temp;
    //     }
    // }
    // public static void PrintArr(int arr[]){
    //     System.out.println("Sorted array is: ");
    //      for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");

    //      }
    //      System.out.println();
        
    // }





    //Insertion sort
    // public static void  InsertionSort(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         int curr= arr[i];
    //         int prev=i-1;
    //         while(prev >=0 && arr[prev]> curr){
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         //insertion
    //         arr[prev+1]=curr;
    //     }

    // }
    // public static void PrintArr(int arr[]){
    //     System.out.println("Sorted array is: ");
    //      for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");

    //      }
    //      System.out.println();
    // }



    //Counting Sort

    public static void CountingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0; i< count.length;i++){
            while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
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
    // bubbleSort(arr);
    // selectionSort(arr);
    //InsertionSort(arr);
    //Arrays.sort(arr); //inbuilt  function for sorting an elements
    CountingSort(arr);
    PrintArr(arr);
       
    
}




}