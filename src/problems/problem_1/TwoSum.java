package problems.problem_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dbh on 2018/8/21.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testNums1 = null;
        int[] testNums2 = {1};
        int[] testNums3 = {1, 2};
        int[] testNums4 = {2, 7, 11, 15};
        int target = 9;
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(testNums1, target);
        System.out.println("Test1: nums=" + print(testNums1) + ",target=9,result=" + print(result));
        result = solution.twoSum(testNums2, target);
        System.out.println("Test2: nums=" + print(testNums2) + ",target=9,result=" + print(result));
        result = solution.twoSum(testNums3, target);
        System.out.println("Test3: nums=" + print(testNums3) + ",target=9,result=" + print(result));
        result = solution.twoSum(testNums4, target);
        System.out.println("Test4: nums=" + print(testNums4) + ",target=9,result=" + print(result));

    }

    private static String print(int[] nums) {
        StringBuilder sb = new StringBuilder("[");
        if (nums != null) {
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1) {
                    sb.append(nums[i]);
                } else {
                    sb.append(nums[i] + ",");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
