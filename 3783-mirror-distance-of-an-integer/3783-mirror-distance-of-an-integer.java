class Solution {
    public int mirrorDistance(int n) {
        int reverse = 0;
        int orgN = n;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        return Math.abs(orgN-reverse);
    }
}