class Solution {
    public boolean isPalindrome(int x) {
        if(Integer.toString(x).charAt(0)=='-') return false;
        int help=x;
        int ans=0;
        while(help!=0)
        {
            int rem=help%10;
            ans=(ans*10)+rem;
            help/=10;
        }
        if(x==ans){
            return true;
        }
        else return false;
    }
}