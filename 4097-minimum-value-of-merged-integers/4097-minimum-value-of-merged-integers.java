class Solution {
    public int minMergedInteger(int[] nums) {
        int max = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i=i+2){
            String a = String.valueOf(nums[i]);
            String b = String.valueOf(nums[i+1]);
            int c = Integer.parseInt(a+b);
             max = Math.min(max,c);

        }
        return max;
    }
}