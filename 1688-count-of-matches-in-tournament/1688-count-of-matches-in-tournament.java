class Solution {
    public int numberOfMatches(int n) {
        int match = 0;
        int unmatch  = 0;
        while(n>1){
            if(n%2==0){
                match  = match + n/2;
                unmatch = n/2;
            }
            else{
                match = match + (n-1)/2;
                unmatch  = (n-1)/2 +1;
           }
           n  = unmatch;
        }
        return match;
    }
}