public class ProductOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productOfArray(nums);
        for(int num : result) {
            System.out.println(num);
        }
    }

    public static int[] productOfArray(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        int rightProduct = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return result;
    }
}
