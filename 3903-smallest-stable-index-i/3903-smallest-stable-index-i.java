class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
       
        for(int i=0;i<nums.length;i++){
             int min=nums[i];
            for(int j=0;j<=i;j++){
                max=Math.max(max,nums[j]);
            }
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
              int ans=max-min;
               if(ans<=k){
                return i;
               }
        }
      
     return -1;  
    }
}