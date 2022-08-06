class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int t=minutesToTest/minutesToDie;
        int cnt=0;
        while((int)Math.pow(t+1,cnt)<buckets)
        {
            cnt++;
        }
        return cnt;
    }
}