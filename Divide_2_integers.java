#29. Divide Two Integers

🔗 [Problem Link](https://leetcode.com/problems/divide-two-integers/)  
📁 Topic: Bit Manipulation, Math

** << - for eg: 5<<1 means 5*2^1**
**Math.abs() refers absolute value -converts -ve into a +ve num**
**Time Complexity**: `O(log(n))`
**Space Complexity**: `O(1)`

import java.util.*;
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)
            return 1;
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(divisor==1)  
            return dividend;
        int sign=1;
        if(dividend>0 && divisor<0)
            sign=-1;
        if(dividend<0 && divisor>0)
            sign=-1;
        if(dividend==-1)
            return -dividend;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        int ans=0;
        while(n>=d){
            int p=0;
            while(n>= d<<p)
            p++;
            p--;
            n -= d<<p;
            ans += 1<<p;
        }
        if(ans>=Math.pow(2,31)&&sign==1)
            return Integer.MAX_VALUE;
        if(ans>=Math.pow(2,31)&&sign==-1)
            return Integer.MIN_VALUE;
        return ans*sign;
    }
}