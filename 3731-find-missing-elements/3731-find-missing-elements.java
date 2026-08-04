class Solution {
    public List<Integer> findMissingElements(int[] nums) {
     Arrays.sort(nums);
     ArrayList<Integer> ans = new ArrayList<>();
     int largest = nums[nums.length-1];
     int small = nums[0];
     int k =0;
     for(int i=small;i<=largest;i++){
        if(nums[k]==i){
            k++;
        }
        else{
            ans.add(i);
        }
     }
     return ans;   
    }
}