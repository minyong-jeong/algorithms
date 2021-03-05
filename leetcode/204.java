/*
    https://leetcode.com/problems/count-primes/
    204. Count Primes (Easy)
*/
class Solution {
    public int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }     
        
        int[] prime = new int[n];
        prime[0] = 1;
        prime[1] = 1;
        
        for (int i = 2; i*i < n; i++) {
            if (prime[i] == 0) {
                for (int j = i*i; j < n; j = j + i) {
                    prime[j] = 1;
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (prime[i] == 0) {
                count++;
            }
        }
        
        return count;
    }
}