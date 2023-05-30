import java.util.Random;

/**
 * This class contains a method to find the kth largest element in an array using quicksort.
 */
class Solution {
    private Random random = new Random();

    /**
     * Finds the kth largest element in the given array.
     *
     * @param nums the input array
     * @param k the value of k
     * @return the kth largest element
     */
    public int findKthLargest(int[] nums, int k) {
        quickSortDescending(nums);  // Sort the array in descending order using quicksort
        return nums[k-1];  // Return the kth largest element from the sorted array
    }

    /**
     * Sorts the given array in descending order using the quicksort algorithm.
     *
     * @param arr the array to be sorted
     */
    public static void quickSortDescending(int[] arr) {
        quickSortDescendingRecur(arr, 0, arr.length - 1);
    }

    /**
     * Recursively sorts the given array in descending order using the quicksort algorithm.
     *
     * @param arr the array to be sorted
     * @param left the left index of the partition
     * @param right the right index of the partition
     */
    private static void quickSortDescendingRecur(int[] arr, int left, int right) {
        while (left < right) {
            int pivotIndex = randomPartition(arr, left, right);  // Get the pivot index using random partition
            if (pivotIndex - left < right - pivotIndex) {
                quickSortDescendingRecur(arr, left, pivotIndex - 1);  // Sort the left partition
                left = pivotIndex + 1;  // Update the left pointer to sort the right partition
            } else {
                quickSortDescendingRecur(arr, pivotIndex + 1, right);  // Sort the right partition
                right = pivotIndex - 1;  // Update the right pointer to sort the left partition
            }
        }
    }

    /**
     * Performs random partitioning of the array and returns the pivot index.
     *
     * @param arr the array to be partitioned
     * @param left the left index of the partition
     * @param right the right index of the partition
     * @return the pivot index
     */
    private static int randomPartition(int[] arr, int left, int right) {
        Random random = new Random();
        int randomIndex = random.nextInt(right - left + 1) + left;  // Generate a random index within the range
        swap(arr, randomIndex, right);  // Swap the randomly selected element with the rightmost element
        return partition(arr, left, right);  // Perform partition and return the pivot index
    }

    /**
     * Partitions the array based on the pivot element and returns the pivot index.
     *
     * @param arr the array to be partitioned
     * @param left the left index of the partition
     * @param right the right index of the partition
     * @return the pivot index
     */
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];  // Choose the rightmost element as the pivot
        int i = left - 1;  // Index of smaller element

        for (int j = left; j < right; j++) {
            if (arr[j] > pivot) {  // If current element is greater than the pivot
                i++;
                swap(arr, i, j);  // Swap arr[i] and arr[j]
            }
        }

        swap(arr, i + 1, right);  // Swap the pivot element with the element at i+1
        return i + 1;  // Return the pivot index
    }

    /**
     * Swaps two elements in the given array.
     *
     * @param arr the array
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];  // Swap arr[i] and arr[j]
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
