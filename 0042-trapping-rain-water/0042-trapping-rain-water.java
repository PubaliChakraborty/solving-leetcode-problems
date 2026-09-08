class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int leftmax = height[left], rightmax = height[right];
        int water = 0;

        while(left < right) {
            if(leftmax < rightmax) {
                left++;
                leftmax = Math.max(height[left], leftmax);
                water += leftmax - height[left];
            } else {
                right--;
                rightmax = Math.max(height[right], rightmax);
                water += rightmax - height[right];
            }
        }
       return water;
    }
}