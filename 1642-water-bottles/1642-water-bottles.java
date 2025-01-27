class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int r=0;
        int q=0;
        int ans=numBottles;
        while(numBottles/numExchange!=0)
        {
            q=numBottles/numExchange;
            r=numBottles%numExchange;
            numBottles=q+r;
            ans+=q;

        }
        return ans;
    }
}