class Solution {
    public int digitFrequencyScore(int n) {
        int temp,ans=0;
        while(n>0){
            temp=n%10;
            ans+=temp;
            n=n/10;
        }
        return ans;
    }
}