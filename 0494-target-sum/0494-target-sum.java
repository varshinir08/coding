class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return soln(nums,target,0,0);
    }
    public int soln(int[] arr,int target,int index,int sum)
    {
        if(index>=arr.length)
        {
            return sum==target?1:0;
        }
        int subtract=soln(arr,target,index+1,sum-arr[index]);
        int add=soln(arr,target,index+1,sum+arr[index]);
        return subtract+add;

    }
}