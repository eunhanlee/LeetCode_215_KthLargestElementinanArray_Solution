import java.util.*;

public class Solution3 {
    /**
     * Finds the kth largest element in the given array.
     *
     * @param nums the input array
     * @param k the value of k
     * @return the kth largest element
     */
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);  // Sort the array in ascending order

        return nums[nums.length-k];  // Return the kth largest element from the end of the sorted array
    }
}
