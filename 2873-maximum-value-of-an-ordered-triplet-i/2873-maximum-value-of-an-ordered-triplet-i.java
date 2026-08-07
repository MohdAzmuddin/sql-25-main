class Solution {
    public long maximumTripletValue(int[] nums) {
        long m = Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k = j+1;k<nums.length;k++){
                m =  Math.max((long)(nums[i]-nums[j])*nums[k],m);
            }
        }
     }
     if(m<0) return 0;
     return m;   
    }
}