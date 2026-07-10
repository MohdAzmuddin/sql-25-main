class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            s.add(candyType[i]);
        } 
        return Math.min(s.size(),candyType.length/2);
    }
}