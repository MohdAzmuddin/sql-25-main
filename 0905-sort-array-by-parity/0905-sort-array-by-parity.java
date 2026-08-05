class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[] = new int[nums.length];
         int k = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[k] = nums[i];
                k++;
            }
            else{
            ans[n-1] = nums[i];
            n--;
            
            }            
        }
        return ans;
    }
}