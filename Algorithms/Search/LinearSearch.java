package Algorithms.Search;

class LinearSearch{
    
    public static boolean linearSearch(int arr[], int target, int index)
    {
        if (index >= arr.length)
        {
            return false;
        }

        if(arr[index] == target)
            {
                return true;
            }

        return linearSearch(arr, target, index+1);
    }

    public static boolean linearSearch(int arr[], int target)
    {
        return linearSearch(arr, target, 0);
    }

    public static void main(String [] args)
    {
        int [] arr = {1,5,4,3,2};  
        int target = 2;      
        System.out.println(linearSearch(arr, target));
    }

}