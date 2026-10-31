class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        int Tnum = 0;
        int count = 0;
        int Tsum = (nums.length*(nums.length+1))/2;
        int sum  = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum +nums[i];
            count = 0;
             for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
             }
             if(count==1){ ans[0] = nums[i];
             Tnum = nums[i];
             }
        }
        ans[1] = Tsum -(sum-Tnum);
        return ans;
    }
}