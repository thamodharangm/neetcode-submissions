class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] nums = numbers;
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(target==nums[i]+nums[j]){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }
}