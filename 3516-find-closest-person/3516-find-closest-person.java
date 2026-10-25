class Solution {
    public int findClosest(int x, int y, int z) {
      int distanceX =Math.abs(z-x);
      int distanceY = Math.abs(z-y);
      if(distanceX<distanceY) return 1;
      else if (distanceX>distanceY) return 2;
      return 0;  
    }
}