package Arrays;
import java.util.*;

public class Array1 {
    // public static void main(String[] var0) {
    //     int[] marks = new int[100];
    //     Scanner var2 = new Scanner(System.in);
    //     marks[0] = var2.nextInt();
    //     marks[1] = var2.nextInt();
    //     marks[2] = var2.nextInt();
    //     System.out.println("phy :" + marks[0]);
    //     System.out.println("Chem:" + marks[1]);
    //     System.out.println("math :" + marks[2]);

    //     int percentage=(marks[0]+marks[1]+marks[2])/3;
    //     System.out.println("percentage = "+percentage);
    //  }


    //Array as a Function Argument

    // public static void update(int marks[]){
    //     for(int i=0;i<marks.length;i++){
    //         marks[i]=marks[i]+1;

    //     }
    // }
    // public static void main(String[] args) {
    //     int marks[]={34,35,56};
    //     update(marks);

    //     for(int i=0;i<marks.length;i++){
    //         System.out.print(marks[i]+" ");
    //     }
    //     System.out.println();
    // }
    

   //Linear Search

   public static int LinearSearch(int numbers[], int key) {
       for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] == key) {
               return i; // Return the index of the key
               }
            }
        
        return -1;
        // Return -1 if the key is not found
   }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    int numbers[] = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
        numbers[i] = sc.nextInt();
    }
    System.out.println("enter the Key element");
    int key= sc.nextInt();
    int index=LinearSearch(numbers, key);
    if(index == -1){
        System.out.println(" key Not found in array");
    }else{
        System.out.println("key is at index "+index);
    }
   }
   }
 