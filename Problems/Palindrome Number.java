/* Runtime: 5ms (Beats 80.04%)
  Memory: 45.68Mb (Beats 72.33%) */
class Solution {
    public boolean isPalindrome(int x) {
        int r=0, n=x;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        return (r==x);
    }
}
