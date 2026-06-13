class Solution {
    public String toLowerCase(String s) {
        //return s.toLowerCase();// direct
        //other way
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                arr[i] = (char)(arr[i]+32);//
            }
        }
        String f = new String(arr);
        return f;
    }
}
// add 22 because
//A = 65   a = 97
//B = 66   b = 98
// difference 97-65 = 32 therefore +32 converts an uppercase letter to lowercase.