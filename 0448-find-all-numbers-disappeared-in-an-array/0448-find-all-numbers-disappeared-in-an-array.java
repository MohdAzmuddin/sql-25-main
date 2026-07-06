class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     HashSet<Integer> s = new HashSet<>();
     List<Integer> ans = new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        s.add(nums[i]);
     }

     for(int i=1;i<=nums.length;i++){
        if(!s.contains(i)) ans.add(i);
     }
     return ans;
    }
}