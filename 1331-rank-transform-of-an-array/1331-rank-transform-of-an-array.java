class Solution {
    public int[] arrayRankTransform(int[] arr) {
     int temp[] = arr.clone();
     Arrays.sort(temp);

     HashMap<Integer,Integer> k = new HashMap<>();

             int rank = 1;
        for (int num : temp) {
            if (!k.containsKey(num)) {
                k.put(num, rank++);
            }
        }

     int ans[] = new int[arr.length];
     for(int i=0;i<ans.length;i++){
        ans[i] = k.get(arr[i]);
     }
    return ans;
    }
}