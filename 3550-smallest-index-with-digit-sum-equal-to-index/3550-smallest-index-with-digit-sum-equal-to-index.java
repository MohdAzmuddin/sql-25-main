class Solution {
    public int smallestIndex(int[] nums) {
       for(int i=0;i<nums.length;i++){
        int hold = nums[i];
        int sum = 0;
        while(hold>0){
            int rem  = hold%10;
            sum = sum +rem;
            hold = hold/10;
        }
        if(i==sum) return i;
       }
       return -1; 
    }
}