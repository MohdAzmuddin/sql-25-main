class Solution {
    public int sumBase(int n, int k) {
        int ans =0;
        while(n>0){
            int s = n%k;
            ans = ans+s;
            n = n/k;
        }
        return ans;
    }
}