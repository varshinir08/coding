class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int index=0;index<nums.length;index++)
        {
            currentSum=currentSum+nums[index];
            if(currentSum>maxSum)
            {
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}