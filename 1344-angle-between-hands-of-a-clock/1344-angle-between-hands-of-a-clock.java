class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12){hour=0;}
     double ans =Math.abs( 5.5*minutes - 30*hour);
     return Math.min(ans,360-ans);

    }
}