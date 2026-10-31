class Solution {
    public int[] singleNumber(int[] nums) {
       int ans[] = new int[2];
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(list.contains(nums[i])) list.remove(Integer.valueOf(nums[i]));
        else list.add(nums[i]);
       }
       ans[0] = list.get(0);
       ans[1] = list.get(1);
       return ans;
    }
}