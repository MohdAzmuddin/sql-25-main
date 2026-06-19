class Solution {
    public int largestAltitude(int[] gain) {
        int currValue = 0;
        int max = 0;
        //int[] ans = new int[gain.length+1];
        //ans[0] = 0;
        for(int i=0;i<gain.length;i++){
           currValue = currValue+gain[i];
           if(max<currValue){max = currValue;}
          // ans[i+1] = currValue;
        }
        //Arrays.sort(ans);
        //return ans[ans.length-1];
        return max;
    }
}