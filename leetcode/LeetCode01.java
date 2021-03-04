import java.util.HashMap;
import java.util.Map;

public class LeetCode01 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 8, 9, 4};
        int target = 6;
        int[] answer = twoSum(nums, target);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            dic.put(nums[i], i);
            int temp = target - nums[i];
            if (dic.containsKey(temp)
                    && dic.get(temp) != i) {
                return new int[]{i, dic.get(temp)};
            }
        }
        return new int[]{0, 0};
    }

/*
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

 */
}