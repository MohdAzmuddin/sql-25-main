class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                int left =0 ;int right = sub.length()-1;
                boolean ispalindrome = true;
                while(left<right){
                    if(sub.charAt(left)!=sub.charAt(right)){
                        ispalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(ispalindrome){
                    count++;
                }
            }
        }
        return count;
    }
}