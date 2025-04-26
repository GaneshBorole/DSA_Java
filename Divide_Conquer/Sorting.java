package Divide_Conquer;
import java.util.*;

public class Sorting {
    // Merge sort
    // Time complexity: O(nlogn)

    public static void Mergesort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // work
        int mid = si + (ei - si) / 2;
        Mergesort(arr, si, mid);       // left part
        Mergesort(arr, mid + 1, ei);   // right part
        merge(arr, si, mid, ei);       // fix: pass mid properly
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;       // iterator for left part
        int j = mid + 1;  // iterator for right part
        int k = 0;        // iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // left part remaining
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part remaining
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for ( k = 0,i=si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }

    //Quick sort
    //time complexity: O(nlogn)

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx - 1);
        quicksort(arr, pidx + 1, ei);
    }
    
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
    
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
        // place pivot at the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
    
        return i + 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Mergesort(arr, 0, arr.length - 1); // fixed method call
       quicksort(arr, 0, arr.length-1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
