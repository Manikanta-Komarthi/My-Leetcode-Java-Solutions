// Given a string s, find the length of the longest substring without duplicate characters.

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.



class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet<Character> set=new HashSet<>();
     int left=0;
     int maxsize=0;
     for(int right=0;right<s.length();right++){
        char ch=s.charAt(right);
        while(set.contains(ch)){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(ch);
        maxsize=Math.max(maxsize,right-left+1);
     }   
     return maxsize;
    }
}
