public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public String searchName(){
        return "Binary Recursive Search";
    }

    @Override
    public int search(int[] arr, int target) {
        return binary(arr, 0, arr.length-1, target);
    }

    // Function to recurr.
    int binary(int[] arr, int start, int end, int target)
    {
        if (end >= start) {
            //If the remaining array has length

            //calculate middle of array. start+ length /2
            int mid = (end - start) + start / 2;

            //If we land on the item right away lol.
            if (arr[mid] == target)
                return mid;

            //Restrict further search
            if (arr[mid] > target)
                return binary(arr, start, mid - 1, target);

            //Keep looking in array.
            return binary(arr, mid + 1, end, target);
        }
        return -1;
    }
}