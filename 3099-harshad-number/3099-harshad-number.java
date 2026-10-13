class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
       int sum = 0;
       int orgX = x;
       while(x>0){
        int digit = x%10;
        sum = sum + digit;
        x = x/10; 
       } 
       if(orgX%sum==0) return sum;
       return -1;
    }
}