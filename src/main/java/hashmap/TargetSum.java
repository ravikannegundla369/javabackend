package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(nums[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 90;
        System.out.println("Input: " + Arrays.toString(nums) + ", Target: " + target);
        int[] indices = findTwoSum(nums, target);
        if (indices.length == 2) {
            System.out.println("Output: [" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No two numbers add up to the target sum.");
        }
    }
}
