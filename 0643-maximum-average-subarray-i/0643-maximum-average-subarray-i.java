class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxavg = 0;

        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxavg = sum;

        
        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            maxavg = Math.max(sum, maxavg);
        }

        return (double) maxavg / k;
    }
}