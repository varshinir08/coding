class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(nums[0]!=0) return 0;
        else if(nums[n-1]!=n) return n;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=i) return i;
        }
        return 0;
    }
}