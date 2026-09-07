class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i<=min;i++){
            if(min%i==0 && max%i==0){
               list.add(i); 
            }
        }
        if (list.size()==0 )return 1;
        return list.get(list.size() - 1);
    }
}