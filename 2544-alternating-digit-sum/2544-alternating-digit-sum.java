class Solution {
    public int alternateDigitSum(int n) {
       int sum =0;
       int i = 1;
      // int countDigit = 0;
       int rev = 0;
       while(n>0){
        int digit = n%10;
        //countDigit++;
        rev = rev*10 + digit;
        n = n/10;
       } 
       while(rev>0){
        int digit = rev%10;
        if(i%2!=0) sum = sum +digit;
        else sum = sum -digit;
        rev = rev/10;
        i++;
       }
       return sum;
    }
}