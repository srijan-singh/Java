package Algorithms.Sort;

import java.util.Scanner;

public class QuickSort {
    
    static public void display(int arr[], int length){
        for(int i=0; i<length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    static public int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int initial = start-1;

        for(int i=start; i<end; i++)
        {
            if(arr[i] < pivot)
            {
                int temp = arr[++initial];
                arr[initial] = arr[i];
                arr[i] = temp;                
            }
        }

        int temp = arr[++initial];
        arr[initial] = arr[end];
        arr[end] = temp;

        return initial;
    }

    static public void quickSort(int arr[], int start, int end){
        if (start<end)
        {
            int pivot_index = partition(arr, start, end);
            quickSort(arr, start, --pivot_index);
            quickSort(arr, ++pivot_index, end);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Length of the Array: ");
        int length = scan.nextInt();

        int arr[] = new int[length];

        for(int i=0; i<length; i++)
        {
            System.out.print("Enter Element "+(i+1)+" : ");
            arr[i] = scan.nextInt();
        }

        scan.close();
        
        System.out.print("Given Array: ");
        display(arr, length);
        
        quickSort(arr, 0, length-1);

        System.out.print("Sorted Array: ");
        display(arr, length);        
    }

}
