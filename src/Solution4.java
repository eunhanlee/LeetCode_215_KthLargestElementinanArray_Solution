import java.util.*;

public class Solution4 {
    /**
     * Finds the kth largest element in the given array.
     *
     * @param nums the input array
     * @param k the value of k
     * @return the kth largest element
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();  // Create a priority queue

        for(int val : nums) {
            pq.offer(val);  // Insert each element into the priority queue

            if(pq.size() > k) {  // If the size of the queue exceeds k, remove the smallest element
                pq.poll();
            }
        }

        return pq.peek();  // Return the smallest element in the priority queue
    }
}
