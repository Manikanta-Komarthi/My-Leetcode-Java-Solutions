// Input: word = "abbcccc"
// Output: 5
// Explanation:
// The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".

class Solution {
    public int possibleStringCount(String word) {
        int count=0;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                count++;
            }
        }
        return ++count;
    }
}
