class Solution {
    long rev = 0;
     public int reverse(int n) {
        while (n !=0){
            rev = rev * 10 + n % 10;
            n = n/10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)rev;
        }
    }
}