package Algorithms.Sort;

import java.util.Scanner;

public class InsertionSort {

    // To print the sorted array
    public static void print(int arr[], int length)
    {
        System.out.print("Sorted Array: ");

        for(int i=0; i<length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
    }

    // To verify if the array is sorted
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

    // To sort from given range
    public static void sort(int arr[], int high)
    {
        for(int i=high; (i-1)>=0; i--)
        {
            if(arr[i] < arr[i-1])
            {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
    }

    // Insertion Sort 
    public static int insertionSort (int arr[], int length) []
    {
        // Returns if array is sorted
        if (isSorted(arr, length) == true)
        {
            return arr;
        }

        // Sort by given range
        for(int i=1; i<length; i++)
        {
            sort(arr, i);
        }

        // Recursion till function is sorted
        return insertionSort(arr, length);
    }
    
    public static void main(String arg[])
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the length of the Array: ");
        int length = scan.nextInt();

        int arr [] = new int [length];

        for(int i=0; i<length; i++)
        {
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = scan.nextInt();
        }

        scan.close();

        insertionSort(arr, length);
        print(arr, length);
    }
    
}
