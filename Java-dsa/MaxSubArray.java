public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum subarray sum is " + maxSum);
    }

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int current = nums[0];

        for(int i=1; i<nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            result = Math.max(result, current);
        }
        return result;
    }
}
