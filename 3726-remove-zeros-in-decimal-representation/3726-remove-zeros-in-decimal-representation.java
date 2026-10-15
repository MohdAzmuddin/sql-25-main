class Solution {
    public long removeZeros(long n) {
        if(n==1) return n;
        long reverse = 0;
        while(n>0){
            long digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        long reverse2 = 0;
        while(reverse>0){
            long digit = reverse%10;
            if(digit>0){
            reverse2 = reverse2*10+digit;}
            reverse = reverse/10;
        }
        return reverse2;
    }
}