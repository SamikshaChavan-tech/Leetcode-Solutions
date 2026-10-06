class Solution {
    public double minimumAverage(int[] nums) {
        float [] avg=new float[nums.length/2];
        float min=1000;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
                avg[i]=(nums[i]+nums[nums.length-1-i])/2.0f;
                min=Math.min(avg[i],min);
        }
        
        return min;
    }
}