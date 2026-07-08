/*
Finding square root of a number
The constraint was not to use any built in function to find it
Therefore I used Binary search

Runtime: 1ms (Beats 97.62%)
Memory: 42.81Mb (Beats 8.34%)

*/
public class SQRT {
    public int mySqrt(int x) {
        int l=0, m, u=x;
        while(l<=u){
            m=(u+l)/2;
            if((long)m*m==x)
                return m;
            else if((long)m*m>x)
                u=m-1;
            else
                l=m+1;
        }
        return u;
    }
}
