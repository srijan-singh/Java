import java.util.Arrays;

class Search{
    
    public static boolean linearSearch(int arr[], int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                return true;
            }
        }
        return false;
    }

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

    public static void main(String [] args)
    {
        int [] arr = {1,5,4,3,2};  
        int target = 6;      
        System.out.println(binarySearch(arr, target));
    }

}