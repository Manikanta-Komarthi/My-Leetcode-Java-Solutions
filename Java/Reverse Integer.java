//solution for Reverse Integer in java


class Solution {
    public int reverse(int x) {
        long result=0;
        while(x!=0){
            result=x%10+result*10;
            x=x/10;
        }
      //if an result is out of range of int then we need to return 0
      //so we need to store result in long and then we can type cast it into int while return
       return (result<Integer.MIN_VALUE||result>Integer.MAX_VALUE) ? 0:(int) result;
    }
}
