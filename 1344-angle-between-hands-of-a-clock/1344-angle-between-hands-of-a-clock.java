class Solution {
    public double angleClock(int hour, int minutes) {
     double ans =Math.abs( 5.5*minutes - 30*hour);
     return Math.min(ans,360-ans);

    }
}