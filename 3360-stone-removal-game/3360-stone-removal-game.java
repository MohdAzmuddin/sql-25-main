class Solution {
    public boolean canAliceWin(int n) {
       int stone = 10;
       while(n>=stone){
        n = n-stone;
        stone--;
       }
       return stone%2==1;
    }
}