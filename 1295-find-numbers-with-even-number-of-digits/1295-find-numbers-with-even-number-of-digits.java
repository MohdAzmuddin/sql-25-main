class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i=0;i<nums.length;i++){
             int store = nums[i];
             int count = 0;
             while(store>0){
                count++;
                store= store/10;
             }
             if(count%2==0) even++;

        }
        return even;
    }
}