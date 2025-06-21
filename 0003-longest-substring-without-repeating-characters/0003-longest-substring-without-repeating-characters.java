class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>window=new HashSet<>();
        int left=0,right=0,max_len=0;
        while(right<s.length())
        {
            if(!window.contains(s.charAt(right)))
            {
                window.add(s.charAt(right));
                max_len=Math.max(max_len,right-left+1);
                right++;
            }
            else{
                window.remove(s.charAt(left));
                left++;
            }
        }
        return max_len;
    }
}