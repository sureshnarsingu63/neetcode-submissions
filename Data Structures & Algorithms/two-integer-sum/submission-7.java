class Pair {
    public int value;
    public int idx;

    public Pair(int value, int idx) {
        this.value = value;
        this.idx = idx;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Pair[] map = new Pair[201];
        int offset = 100;
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(complement >= -offset && complement < offset && map[complement+offset] != null) {
                return new int[] {map[complement + offset].idx, i};
            }
            map[nums[i]+offset] = new Pair(nums[i], i);
        }       
        return new int[0];
    }
}
