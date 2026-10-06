class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxDiff = 0;
        if(nums.length<2)return 0;
        for(int i=0;i<nums.length-1;i++){
              int diff = nums[i+1]-nums[i];
              maxDiff = Math.max(maxDiff,diff);
        }
        return maxDiff;
    }
}