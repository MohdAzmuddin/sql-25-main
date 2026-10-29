class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = 0, floor = 0;

        for (int i = 0; i < requests.length; i++) {
            time = time + Math.abs(floor - requests[i]);
            floor = requests[i];
        }

        return time;
    }
}