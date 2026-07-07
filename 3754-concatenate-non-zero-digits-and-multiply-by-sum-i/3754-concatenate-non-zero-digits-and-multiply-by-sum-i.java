class Solution {
    public long sumAndMultiply(int n) {
        long sum =0;
        int x=0;
        int x1= 0;
        while(n>0){
            int rem = n%10;
            if(rem!=0){
              x =x*10 +rem;
              sum = sum +rem;
            }
            n = n/10;
        }
        while(x>0){
            int r1 = x%10;
             x1 = x1*10+r1;
             x=x/10;
        }
          return (long) x1*sum;
    }
}