class Solution {
    public int sumBase(int n, int k) {
        int a =0;
        while(n>0){
            int s = n%k;
            a = a+s;
            n = n/k;
        }
        return a;
    }
}