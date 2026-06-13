class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        String sum ="";
        boolean neg = num<0;
        num = Math.abs(num);
        while(num>0){
          int rem = num%7;
          sum = rem+sum;
          num = num/7;
        }
        if(neg){
            sum = "-" + sum;
            }
        return (sum);
    }
}