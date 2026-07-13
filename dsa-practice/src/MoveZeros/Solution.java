package MoveZeros;

import java.util.Arrays;

public class Solution {

    public static int[] moveZeroes(int[] nums) {
        int insertPos = 0;
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos++] = tmp;
            }
            i++;
        }
        return nums;
    }

//    public void moveZeroes(int[] nums) {
//        int insertPos = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                // Only swap when the element isn't already in position
//                if (i != insertPos) {
//                    nums[insertPos] = nums[i];
//                    nums[i] = 0;
//                }
//                insertPos++;
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
