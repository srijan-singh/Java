package Algorithms.Sort;

import java.util.Scanner;

public class MergeSort {

    // To print sorted array
    public static void print(int arr[], int length)
    {
        System.out.print("Sorted Array: ");

        for(int i=0; i<length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
    }

    // Insertion Sort
    public static void insertionSort(int arr[], int low, int high)
    {
        for(int i=high; (i-1)>=low; i--)
        {
            if( arr[i] < arr[i-1] )
            {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
    }

    // Merge Sort
    public static int mergeSort(int arr[], int length, int index) []
    {
        if (length <= index)
        {
            return arr;
        }
  
        // The range is defined by index.
  
        /*
            If array has 8 elements:  ********
            It will sort array until it's less than length of array.
            1st call  2*1 elements max: ** ** ** ** // Called from Main Function
            2nd call  2*2 elements max: **** ****
            3rd call  2*3 elements max: ********
            Returns Array
        */

        // The range is defined by index.
        for(int i=0; (i+index)<length; i+=index)
        {
            insertionSort(arr, i, i+index);
        }

        return mergeSort(arr, length, index*2);
    }

    
    public static int mergeSort(int arr[], int length) []
    {
        return mergeSort(arr, length, 2); // Will start from sub array of 2 element
    }

    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter length of the Array: ");
        int length = scan.nextInt();
        int arr [] = new int [length];

        for(int i=0; i<length; i++)
        {
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = scan.nextInt();
        }
        scan.close();

        mergeSort(arr, length);

        print(arr, length);
    }
}
