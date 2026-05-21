class NumArray {
int  prefix[];
    public NumArray(int[] nums) {
        int sum = 0;
        prefix = new int[nums.length+1];
        for(int i = 0;i < nums.length;i++){
          sum = sum+nums[i];
          prefix[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */