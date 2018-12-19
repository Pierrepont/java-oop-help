public class riley_mergeSortRecursive
{
    public static void main(String[] args)
    {
        int[] array = {12, 1, 17, 2, 4, 3, 6, 8};
        recursiveMerge(array);
        arrayPrint(array);
    }

    // helper method so that the 2nd and 3rd args aren't needed in L6
    static public void recursiveMerge(int[] arr)
    {
        recursiveMerge(arr, 0, arr.length-1);
    }

    
    static public void recursiveMerge(int[] arr, int low, int high)
    {

        // base case
        if(low>=high){return;}

        int mid = (low+high)/2;

        // first subarray
        recursiveMerge(arr, low, mid);

        // second subarray
        recursiveMerge(arr, mid+1,high);

        merge(arr, low, high, mid);
                
    }

    static public void merge(int[] arr, int low, int high, int mid)
    {
        // start of second subarray
        int firstOfB = mid + 1;

        // each subarray is guaranteed to be sorted, so if the first element
        // of the first subarray is less than the first elem of the second,
        // nothing needs to be done
        if(arr[low]>arr[firstOfB])
        {
            // this assumes each subarray is the same length,
            // an accepted limitation for now
            for(int i = 0; i < firstOfB-low; i++)
            {
                // swaps the Nth elem of subarrayOne with the
                // Nth elem of subarrayTwo, thereby swapping the subarrays
                // entirely
                swap(arr, low+i, firstOfB+i);
            }
        }
    }

    // trivial swap method
    static public void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // taken from another program, I know for sure it works
    public static void  arrayPrint(int[] arr)
    {
        System.out.print("{");
        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.print(" " + arr[i] + ",");
        }
        System.out.println("}");
    }    
}