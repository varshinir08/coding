class Solution {
    public int arrangeCoins(int n) {
        int low=0;
        int high=n;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            long coinUsed=mid*(mid+1)/2;
            if(coinUsed==n)
            {
                return (int)mid;
            }
            if(n<coinUsed)
            {
                high=(int)mid-1;
            }
            else{
                low=(int)mid+1;
            }
        }
        return (int)high;
    }
}