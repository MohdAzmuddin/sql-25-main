class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];

        for (int w = 1; w <= area; w++) {
            if (area % w == 0) {
                int l = area / w;

                if (l >= w) {
                    ans[0] = l;
                    ans[1] = w;
                }
            }
        }

        return ans;
    }
}