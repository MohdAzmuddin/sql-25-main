/*class Solution {
    public int sumOfUnique(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            int  count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
            }
            if(count==1) sum = sum +nums[i];
        }
        return sum;
    }
}// tc o(n2) now using HashMap tc = o(n)*/

class Solution {
    public int sumOfUnique(int[] nums) {
        int sum =0;
        HashMap<Integer,Integer> ans = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(ans.get(nums[i])==1) sum = sum +nums[i];
        }
        return sum;
    }
}