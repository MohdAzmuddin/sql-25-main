import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);

        if(Arrays.equals(arr,arr2)){
            return true;
        }
        return false;
    }
}