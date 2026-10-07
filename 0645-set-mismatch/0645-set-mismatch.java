import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] temp=new int[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                temp[0]=nums[i];
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int sum=0;
        for(int x:set){
            sum+=x;
        } 
        int actual=nums.length*(nums.length+1)/2;
        temp[1]=actual-sum;
        return temp;
    }
}