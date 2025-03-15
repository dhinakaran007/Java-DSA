public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 2, 8, 4, 5};
        int result = findMissingNumber(nums);
        System.out.println("Missing number is: " + result);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int product = (n+1) * (n+2) / 2;
        int actualSum = 0;
        for(int num : nums) {
            actualSum += num;
        }

        return product - actualSum;
    }
}
