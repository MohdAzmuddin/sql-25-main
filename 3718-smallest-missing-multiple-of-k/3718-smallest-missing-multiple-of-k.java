class Solution {
    public int missingMultiple(int[] nums, int k) {
     HashSet<Integer> h  = new HashSet<>();
     for(int i=0;i<nums.length;i++){ h.add(nums[i]);}
     int multiple = k;
     while(h.contains(multiple)){
        multiple = multiple +k;
     }
     return multiple;
    }
}