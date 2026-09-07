class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        sum=nums[nums.length-1]+nums[nums.length-2]-nums[0];
        return sum;
    }
}