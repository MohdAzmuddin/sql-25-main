class Solution {
    public int calculateScore(int a, int b) {
        int s1 =0,s2 =0;
        while(a>0){
            int rem = a%2;
            if(rem==1) s1++;
            a = a/2  ;
        } 
        while(b>0){
            int rem = b%2;
            if(rem==1) s2++;
            b = b/2 ; 
        }
        if(s1>=s2) return s1*s2;
        return s2/s1;
    }
}