//Given two Strings s and t.
//find that s is a subsequence of t or not.

class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0,count=0;
        for(int i=0;i<s.length();i++){
            while(j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    count++;
                    j++;
                    break;
                }
                j++;
            }
        }
        if(count==s.length()){
            return true;
        }
        else return false;
    }
}
