class Solution {
    public int[] twoSum(int[] nums, int target) {
        nums = Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left, right};
            }
            if (sum > target) {
                right--;
            }
            if (sum < target) {
                left++;
            }
        }
        return new int[0];
    }
}
