class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            for(int k=0;k<nums2.length;k++){
                if(i==k && nums1[i]<nums2[k]){
                    ans=nums2[k]-nums1[i];
                }
                else if(i==k && nums1[i]>nums2[k]){
                    ans=nums2[k]-nums1[i];
                }
            }
        }
        return ans;
    }
}