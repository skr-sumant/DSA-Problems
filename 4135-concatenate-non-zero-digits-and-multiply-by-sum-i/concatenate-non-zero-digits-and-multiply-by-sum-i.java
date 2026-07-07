class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0)
            return 0;

        int temp = n;
        int rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;

        }
        int sum = 0;
        long x = 0;
    
        while (rev > 0) {
            int digit = rev % 10;

            if (digit != 0) {
                x = x * 10 + digit;
                sum += digit;

            }
            rev /= 10;
        }
        return (x * sum);

    }
}