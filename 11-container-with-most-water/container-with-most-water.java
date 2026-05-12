class Solution {
    public int maxArea(int[] arr) {
        int area = 0;
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            int width  = right-left;
            int height = Math.min(arr[left],arr[right]);
            area = Math.max(area, width*height);

            if(arr[left]< arr[right]){
                left++;
            }else{
                right--;
            }

        }
        return area;

        
    }
}