public class Solution {
    // you need to treat n as an unsigned value
    /*
     * bitwise AND ( & )
     * 6 in binary 0110
     * 3 in binary 0011
     *
     * bitwise AND of 6 and 3
     *
     * 0  1 1 0
     * 0  0 1 1
     *━━━━━━━━━━━
     * 0  0 1 0  = 2 in decimal
     *
     *
     * if we perform bitwise AND of 1 with each individual digit of number and check if its 1 or 0 we can count the 1 bits.
     *
     */
    public int hammingWeight(int n) {
        int count = 0;
        
        for(int i=0;i<32;i++){
            // perform bitwise AND and save in count variable
            count += n & 1;
            // bitwise right shift by 1
            /*
             *         if n = 100101011
             * n>>1 means n = 10010101
             * n>>1 means n = 1001010
             * n>>1 means n = 100101
             * n>>1 means n = 10010
             * n>>1 means n = 1001
             * n>>1 means n = 100
             * n>>1 means n = 10
             * n>>1 means n = 1
             *
             */
            n >>= 1;
        }
        
        // return the total count
        return count;
    }
}
