import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (map.containsKey(k)) {
                return new int[] {map.get(k), i};
            }
            map.put(nums[i], i);
        }
        
        return new int []{};

    }
    public static void main(String[] args) {
        int []nums = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(nums));
    }
}
