
class Solution {
    public long maxPairStrength(int[] nums) {
        long maxGcd = 1;
        long maxStrength = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long a = nums[i];
                long b = nums[j];

                while (b != 0) {
                    long temp = b;
                    b = a % b;
                    a = temp;
                }

                maxGcd = a;

                long strength = ((long) nums[i] * nums[j])
                        / (maxGcd * maxGcd);

                maxStrength = Math.max(maxStrength, strength);
            }
        }

        return maxStrength;
    }
}
