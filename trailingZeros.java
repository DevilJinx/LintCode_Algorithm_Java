/*
Description
Write an algorithm which computes the number of trailing zeros in n factorial.
Example
11! = 39916800, so the out should be 2
Challenge
O(log N) time
*/

/*
计算阶乘结果尾部的“0”的个数：
    对于一个M进制的数，结尾多一个“0”，就等价于乘以一个“M”。
    所以对于十进制的数，尾部有多少个“0”取决于其因数有多少个“10”，而10=2*5，2的个数明显多于5，所以问题转化为1到n中“5”的个数。
*/

class Solution{
    public long trailingZeros(long n){
        long sum = 0;
        while (n != 0) {
            sum += n / 5;
            n /= 5;
        }
        return sum;
    }
}