class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int filledBottles=0;
        int remainedBottles=0;
        int max_waterBottledrunk=numBottles;
        while(numBottles/numExchange!=0)
        {
            filledBottles=numBottles/numExchange;
            remainedBottles=numBottles%numExchange;
            numBottles=filledBottles+remainedBottles;
            max_waterBottledrunk+=filledBottles;

        }
        return max_waterBottledrunk;
    }
}