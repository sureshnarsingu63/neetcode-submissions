class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestConsecutive = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currtConsecutive = 1;
                int currNum = num;
                while (set.contains(currNum + 1)) {
                    currtConsecutive++;
                    currNum++;
                }
                longestConsecutive = Math.max(longestConsecutive, currtConsecutive);
            }
        }
        return longestConsecutive;
    }
}
