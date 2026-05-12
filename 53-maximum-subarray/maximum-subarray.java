class Solution {
    public int maxSubArray(int[] arr) {
        int curr = arr[0];
        int maxsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
           
            curr = Math.max(arr[i], (curr + arr[i]));
            
            maxsum = Math.max(curr, maxsum);
        }
        return maxsum;

    }
}