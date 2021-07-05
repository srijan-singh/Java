/*
    Bubble Sort
    Srijan Singh 05 July 2021
*/
package Algorithms.Sort;

import java.util.Scanner;

public class BubbleSort {

    public static void print(int arr[])
    {
        System.out.print("Sorted Array: ");

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static boolean isSorted(int arr [])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static int bubble_up(int arr []) []
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }

    public static int bubbleSort(int arr []) []
    {
        arr = bubble_up(arr);

        if (isSorted(arr) == true)
        {
            return arr;
        }

        return bubbleSort(arr);
    }

    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Length of Array: ");
        int length = scan.nextInt();

        int [] arr = new int [length];

        for(int i=0; i<length; i++)
        {   
            System.out.println("Enter element "+ (i+1) +" : ");
            arr[i] = scan.nextInt();
        }
        scan.close();

        arr = bubbleSort(arr);

        print(arr);

    }
    
}
