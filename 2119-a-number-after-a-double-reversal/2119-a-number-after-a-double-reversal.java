class Solution {
    public boolean isSameAfterReversals(int num) {
        int org1 = num;
        int rev1 = 0;
        while(num>0){
            int rem = num%10;
            rev1 = rev1*10 + rem;
            num  =  num/10;
        }
        int org2 = rev1;
        int rev2 = 0;
        while(rev1>0){
            int rem = rev1%10;
            rev2 = rev2*10 + rem;
            rev1 = rev1/10;
        }
        if(rev2==org1) return true;
        return false;
    }
}