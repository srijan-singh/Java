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

    // To verify
    public static boolean isSorted(int arr[], int length)
    {
        for(int i=0; (i+1)<length; i++)
        {
            if (arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    // Insertion Sort
    public static void insertionSort(int arr[], int high)
    {
        for(int i=high; (i-1)>=0; i--)
        {
            if (arr[i] < arr [i-1])
            {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
    }

    // To sort the sub array
    public static void sort(int arr[], int high, int low)
    {
        for(int i=low; i<high; i++)
        {
            if(arr[i+1] < arr[i])
            {
                insertionSort(arr,i+1); // Used Insertion Sort to sort the divided array
            }
        }    
    }

    // Merge Sort
    public static int mergeSort(int arr[], int length, int index) []
    {
        if (isSorted(arr, length) == true)
        {
            return arr;
        }
  
        /*
            If array has 8 elements:  ********
            It will start sorting until it's less than length of array.
            1st call  2*1 elements max: ** ** ** ** // Called from Main Function
            2nd call  2*2 elements max: **** ****
            3rd call  2*3 elements max: ********
            Returns Array
        */

        // The range is defined by index.
        for(int i=0; (i+index)<length; i+=index)
        {
            sort(arr, i+1, i);
        }

        return mergeSort(arr, length, index*2);
    }

    // To assign index as 2
    public static int mergeSort(int arr[], int length) []
    {
        return mergeSort(arr, length, 2); // Will create sub arra of 2-2 element
    }

    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scan.nextInt();

        int arr[] = new int [length];

        for(int i=0; i<length; i++)
        {
            System.out.print("Enter element "+ (i+1) +" : ");
            arr[i] = scan.nextInt();
        }
        scan.close();

        mergeSort(arr, length);

        print(arr, length);

    }
    
}
