class Solution {
    public int findLucky(int[] arr) {
        int largest = -1;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count==arr[i]){
              largest = Math.max(largest,arr[i]);
            }
        }
        return largest;
    }
}