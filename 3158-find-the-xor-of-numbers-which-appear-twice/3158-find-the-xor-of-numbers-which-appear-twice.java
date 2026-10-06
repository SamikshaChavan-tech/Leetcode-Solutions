class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        // HashMap<Inetger ,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int n:map.va)

        Arrays.sort(nums);
        int xor=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                xor^=nums[i];
            }
        }
        return xor;
    }
}