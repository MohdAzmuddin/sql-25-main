class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                   String k = s.substring(i,j);
                   int left = 0;
                   int right = k.length()-1;
                   boolean ispalindrome = true;
                   while(left<right){
                    if(k.charAt(left)!=k.charAt(right)){
                        ispalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                   }
                   if(ispalindrome  && k.length() > ans.length()){
                    ans = k;
                   }
            }
        }
        return ans;
    }
}