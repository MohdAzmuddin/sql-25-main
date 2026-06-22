import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
           
            if(set.contains(nums[i+1])) {
                return nums[i+1];
            }
           
        }

        return -1;
    }
}