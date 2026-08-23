/*
Runtime: 12ms (Beats:43.79%)
Memory: 47.76 MB (Beats: 32.93%)
*/

class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int len_sub=0;
        String x="";
        s=s+" ";
        for(int i=0;i<s.length()-1; i++)
        {
            char c=s.charAt(i);
            x=x+c;
            if(x.indexOf(s.charAt(i+1))!=-1)
            {
                if(x.length()>len_sub)
                    len_sub=x.length();
                x=x.substring(x.indexOf(s.charAt(i+1))+1);
            }
        }
        if(x.length()>len_sub)
            len_sub=x.length();
        return len_sub;
    }
}
