class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int ans=0;
        int ans2=1;
        while(n>0){
            temp=n%10;
            n=n/10;
            ans=ans+temp;
            ans2=ans2*temp;

        }
        return ans2-ans;
    }
}