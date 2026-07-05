class Solution {
    public int maxDigitRange(int[] nums) {
        int maxr=0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
            int n = nums[i];
            while(n>0){
                int rem = n%10;
                n = n/10;
               max = Math.max(max,rem);
               min = Math.min(min,rem);
            }
            int range = max - min;

if (range > maxr) {
    maxr = range;
    sum = nums[i];
} else if (range == maxr) {
    sum += nums[i];
}
        }
        return sum;
    }
}