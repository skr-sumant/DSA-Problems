class Solution {
    public int minElement(int[] nums) {
        int minEle = Integer.MAX_VALUE;
        for(int n : nums){
        int sum = 0;
        while(n >0){
            sum += n%10;
            n /=10;
        }
        minEle =  Math.min(minEle, sum);

        }
        return minEle;

        
    }
}