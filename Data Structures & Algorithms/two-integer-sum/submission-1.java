

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Store number and its index

        for (int i = 0; i < nums.length; i++) { // Iterate through array
            int comp = target - nums[i]; // Calculate complement
            if (map.containsKey(comp)) { // Check if complement exists in map
                return new int[] { map.get(comp), i }; // Return indices
            }
            map.put(nums[i], i); // Store number and index in the map
        }

        return null; // Return null if no solution is found
    }
}
