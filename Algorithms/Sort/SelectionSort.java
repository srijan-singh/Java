package Algorithms.Sort;

import java.util.Scanner;

public class SelectionSort {

    public static void print(int arr[], int length)
    {
        System.out.print("Sorted Array: ");

        for(int i=0; i<length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
    }

    public static int minElement(int arr[], int low)
    {
        int min = 9999999;
        int index = 0;

        for(int i=low; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int selectionSort(int arr[], int length) []
    {
        for(int i=0; i<length; i++)
        {
            int min = minElement(arr, i);
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        
        }
        return arr;
    }
    
    public static void main(String args [])
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

        arr = selectionSort(arr, length);
        print(arr, length);
    }
}
