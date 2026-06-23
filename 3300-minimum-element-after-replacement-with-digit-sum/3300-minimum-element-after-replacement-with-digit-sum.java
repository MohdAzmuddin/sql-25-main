import java.util.Arrays;

class Solution {
    public int minElement(int[] nums) {
            int k=0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            nums[k++] = sum;
        }

        Arrays.sort(nums);
        return nums[0];
    }
}