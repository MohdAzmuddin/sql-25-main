class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        String ch = String.valueOf(x);
        if(s.contains(ch)&& s.charAt(0)!=ch.charAt(0)) return true;
        return false;
    }
}