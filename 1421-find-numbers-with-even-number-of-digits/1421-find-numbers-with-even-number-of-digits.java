class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count+=1;
            }

        }
        return count;
        
    }

    public boolean even(int num)
    {
        int num_ofDigits=digits(num);
        return num_ofDigits%2==0;
    }

    public int digits(int num)
    {
        if(num<0)
          num=-num;
        return (int) (Math.log10(num))+1;
    }
}