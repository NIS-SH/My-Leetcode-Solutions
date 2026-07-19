
/* Runtime: 1ms (Beats 99.98%)
  Memory: 42.56Mb (Beats 63.99%) */

class Solution {
    public int reverse(int x) {
        int n=Math.abs(x);
        long rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n/=10;
        }
        if(rev>=Integer.MAX_VALUE)
            return 0;
        if(x<0)
            return (int)(-rev);
        else
            return (int)rev;
    }
}
