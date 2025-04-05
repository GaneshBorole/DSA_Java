package Arrays;
import java.util.*;

public class Array2D {

    // public static boolean search(int [][] matrix,int key){
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //            if( matrix[i][j] ==key){
    //              System.out.println("key found at cell ("+i+","+j+")");
    //              return true;
    //            }
    //         }

    //     }
    //     System.out.println("key is not found");
    //     return false;
        
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter size:");
    //     int size = sc.nextInt();

    //     int[][] matrix = new int[size][size];

    //     // Input
    //     System.out.println("Enter the elements:");
    //     for (int i = 0; i < size; i++) {
    //         for (int j = 0; j < size; j++) {
    //             matrix[i][j] = sc.nextInt();
    //         }
    //     }

    //     // Output
    //     System.out.println("The matrix is:");
    //     for (int i = 0; i < size; i++) {
    //         for (int j = 0; j < size; j++) {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("enter the key element");
    //     int key= sc.nextInt();
    //     search(matrix,key);

    //     sc.close(); // Always a good practice
    // }

              


    //Print Reverse numbers in arrayList
    // public static void main(String[] args) {
    //     ArrayList<Integer> list=new ArrayList<>();
    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);
    //     list.add(5);

    //     for(int i=list.size()-1;i>=0;i--){
    //         System.out.print(list.get(i)+" ");
    //     }
    //     System.out.println();
    // }



    //Print Maximum nuber in ArrayList
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        List <Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }

        System.out.println("Max element is: " + max);
    }
    }
   
    



