class Solution {
    public boolean canWinNim(int n) {
      if(n%4!=0) return true;
      return false;
    }
}
/*
n = 1  → Win
n = 2  → Win
n = 3  → Win
n = 4  → Lose
n = 5  → Win (take 1, leave 4)
n = 6  → Win (take 2, leave 4)
n = 7  → Win (take 3, leave 4)
n = 8  → Lose
n = 9  → Win
n = 10 → Win
n = 11 → Win
n = 12 → Lose

4, 8, 12, 16, ... losing*/