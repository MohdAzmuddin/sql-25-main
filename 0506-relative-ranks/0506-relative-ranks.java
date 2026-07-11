class Solution {
    public String[] findRelativeRanks(int[] score) {
      int[] temp = score.clone();
      Arrays.sort(temp);

      HashMap<Integer,String> k = new HashMap<>();
      
       int rank =1;
      
       for(int i=temp.length-1;i>=0;i--){
           if(rank==1) k.put(temp[i],"Gold Medal");
           else if(rank==2) k.put(temp[i],"Silver Medal");
           else if(rank==3) k.put(temp[i],"Bronze Medal");
           else k.put(temp[i],String.valueOf(rank));
           rank++;
       }
      
       String[] ans = new String[score.length];
       for(int i=0;i<ans.length;i++){
        ans[i] = k.get(score[i]);
       }
       return ans;
    }
}