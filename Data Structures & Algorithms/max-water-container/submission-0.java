class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        for (int left = 0, right = heights.length - 1; left < right;) {
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, width * height);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
