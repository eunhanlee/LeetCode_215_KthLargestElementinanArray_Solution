public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();
        Solution2 tt2 = new Solution2();
        Solution3 tt3 = new Solution3();
        Solution4 tt4 = new Solution4();

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(tt.findKthLargest(nums,k));
        System.out.println(tt2.findKthLargest(nums,k));
        System.out.println(tt3.findKthLargest(nums,k));
        System.out.println(tt4.findKthLargest(nums,k));
    }
}