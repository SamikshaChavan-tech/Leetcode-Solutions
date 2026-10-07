class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if(low%2==0 && high%2==0){
            int ans=(high-low)/2;
            return ans;
        }else{
        for(int i=low;i<=high;i++){
            if(i%2!=0){
                count++;
            }
        }
        }
    return count;   
    }
}