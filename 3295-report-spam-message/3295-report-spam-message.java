class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> ans = new HashSet<>();
        for(int i=0;i<bannedWords.length;i++){
            ans.add(bannedWords[i]);
        }
          int count = 0;
        for(int i =0;i<message.length;i++){
            if(ans.contains(message[i])) count++;
              if(count>=2) return true;
        }
        return false;
    }
}