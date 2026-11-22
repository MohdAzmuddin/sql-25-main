class Solution {
    public int countDominantElements(int[] nums) {
        int dominent = 0;
        if(nums.length==1) return 1;
        for(int i=0;i<nums.length;i++){
             if(i==0){
                if(nums[i]>=nums[i+1]) dominent++;
             }
             else if(i==nums.length-1){
                if(nums[i]>=nums[i-1]) dominent++;
             }
             else{
                if(nums[i]>=(nums[i-1]+nums[i+1])/2.0) dominent++;
             }
        }
        return dominent;
    }
}