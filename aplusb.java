/*
Description
Write a function that add two numbers A and B.

Clarification
Are a and b both 32-bit integers?

Yes.
Can I use bit operation?

Sure you can.
Example
Given a=1 and b=2 return 3.

Challenge
Of course you can just return a + b to get accepted. But Can you challenge not do it like that?(You should not use + or any arithmetic operators.)
*/

public class aplusb {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println(a);
    }
}
