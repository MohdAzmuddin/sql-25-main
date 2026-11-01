class Solution {
    public int minMoves(int[] nums) {
      int min  = nums[0];
      for(int i=0;i<nums.length;i++){
        if(min>nums[i]) min = nums[i];
      }  
      int move=0;
      for(int i=0;i<nums.length;i++){
        move = move +nums[i]-min;

      }
      return move;
    }
}