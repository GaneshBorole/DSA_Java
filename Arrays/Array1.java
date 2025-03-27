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

//    public static int LinearSearch(int numbers[], int key) {
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == key) {
//                return i; // Return the index of the key
//                }
//             }
//         return -1;// Return -1 if the key is not found
//    }
//    public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter the size of the array:");
//     int size = sc.nextInt();
//     int numbers[] = new int[size];
//     System.out.println("Enter the elements of the array:");
//     for (int i = 0; i < size; i++) {
//         numbers[i] = sc.nextInt();
//     }
//     System.out.println("enter the Key element");
//     int key= sc.nextInt();
//     int index=LinearSearch(numbers, key);
//     if(index == -1){
//         System.out.println(" key Not found in array");
//     }else{
//         System.out.println("key is at index "+index);
//     }
//    }
 

//Largest Number in Array


// public static int getLargest(int numbers[]){
//     int largest=Integer.MIN_VALUE;//-infinity
//     for (int i=0;i<numbers.length;i++){
//         if(largest < numbers[i]){
//             largest=numbers[i];
//         }
//     }
//     return largest;
// }
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     System.out.println("enter the size of array");
//     int size=sc.nextInt();
//     int numbers[]=new int [size];
//     System.out.println("enter the elements");
//     for(int i=0;i<numbers.length;i++){
//         numbers[i]=sc.nextInt();
        
//     }
//     System.out.println("largest value is "+getLargest(numbers));
// }


//Binary Search

// public static int BinarySearch(int numbers[], int key){
//     int start=0 ;
//     int end= numbers.length-1;

//     while (start<= end) {
//         int mid=(start+ end)/2;

//         //comaparisons
//         if(numbers[mid] == key){
//             return mid;
//         }
//         if(numbers[mid] < key){ //for 2nd half search
//             start=mid+1;
//         }else{
//             end=mid-1;
//         }
//     }
//     return -1; // Return -1 if the key is not found
// }
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     System.out.println("enter the size of array");
//     int size= sc.nextInt();
//     int numbers[]=new int[size];
//     System.out.println("enter element in array");
//     for(int i=0;i<numbers.length;i++){
//         numbers[i]=sc.nextInt();
//     }
//     System.out.println("enter the key");
//     int key= sc.nextInt();

//     int index = BinarySearch(numbers, key);
//     if (index == -1) {
//         System.out.println("key doesn't exist in  found");
//     }else{
//         System.out.println("key at index "+index);
//     }
// }


    // public static void reverse(int numbers[]) {
    //     int start = 0;
    //     int end = numbers.length - 1;

    //     while (start < end) {
    //         int temp = numbers[end];
    //         numbers[end] = numbers[start];
    //         numbers[start] = temp;

    //         start++;
    //         end--;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the size of array:");
    //     int size = sc.nextInt();
    //     int numbers[] = new int[size];

    //     System.out.println("Enter the elements:");
    //     for (int i = 0; i < numbers.length; i++) {
    //         numbers[i] = sc.nextInt();
    //     }

    //     // Call reverse function after input is completed
    //     reverse(numbers);

    //     System.out.println("Reversed array:");
    //     for (int i=0;i<numbers.length;i++) {
    //         System.out.print(numbers[i] + " ");
    //     }

      
    // }



    //Pairs in array

    
        public static void pairsinArray(int numbers[]) {
            for (int i = 0; i < numbers.length; i++) {
                int curr = numbers[i];
    
                for (int j = i + 1; j < numbers.length; j++) {
                    System.out.println("(" + curr + " , " + numbers[j] + ")");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the size:");
            int size = sc.nextInt();
            int numbers[] = new int[size];
    
            System.out.println("Enter the elements:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }
    
            // Printing pairs
            pairsinArray(numbers);
    
            // Corrected loop to print array elements
            System.out.println("Array elements:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i] + " ");
            }
    
            sc.close(); // Close Scanner to avoid memory leaks
        }
    }
    

 