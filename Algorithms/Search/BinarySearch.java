package Algorithms.Search;

import java.util.Arrays;

public class BinarySearch{
    
    public static boolean binarySearch(int arr[], int target, int low, int high)
    {
        int mid = (low+high)/2;
        
        if(arr[mid] == target)
        {
            return true;
        }

        else if (arr[mid] > target && target >= arr[0])
        {
            return binarySearch(arr, target, low, mid);
        }

        else if (arr[mid] < target && target <= arr[arr.length -1])
        {
            return binarySearch(arr, target, mid, high);
        }
        
        return false;
    }

    public static boolean binarySearch (int arr[], int target)
    {
        Arrays.sort(arr);

        if (binarySearch(arr, target, 0, arr.length - 1) == true)
        {
            return true;
        }

        return false;   
    }

    public static void main(String args[])
    {
        int arr [] = {1, 4, 5, 2, 3};
        int target = 1;

        System.out.println(binarySearch(arr, target));
    }
    
}
