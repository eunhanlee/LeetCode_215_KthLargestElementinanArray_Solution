import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    /**
     * Finds the kth largest element in the given array.
     *
     * @param nums the input array
     * @param k the value of k
     * @return the kth largest element
     */
    public int findKthLargest(int[] nums, int k) {
        Integer[] integerArray = Arrays.stream(nums)  // Convert int[] to Integer[]
                .boxed()  // Box each element into Integer wrapper
                .toArray(Integer[]::new);  // Convert to Integer[]

        Arrays.sort(integerArray, Comparator.reverseOrder());  // Sort in reverse order

        return integerArray[k-1];  // Return the kth largest element
    }
}
