public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i];
            if (map.containsKey(tmp)) {
                return new int[] { map.get(tmp), i + 1 };
            }
            map.put(numbers[i], i + 1);
        }
        return null;
    }
}