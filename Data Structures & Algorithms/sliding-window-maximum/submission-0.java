class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int left = 0, index = 0;

        for (int right = 0; right < n; right++) {
            if ((right - left + 1) == k) {
                int max = nums[left];
                for (int i = left; i <= right; i++) {
                    max = Math.max(max, nums[i]);
                }
                result[index++] = max;
                left++;
            }
        }
        return result;
    }
}
