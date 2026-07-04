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
        Pair[] map = new Pair[100];
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(complement >= 0 && complement< map.length && map[complement] != null) {
                return new int[] {map[complement].idx, i};
            }
            map[nums[i]] = new Pair(nums[i], i);
        }       
        return new int[0];
    }
}
