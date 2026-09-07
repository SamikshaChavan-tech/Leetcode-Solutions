class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int temp=n;
        int sum=0;
        int prod=1;
        while(n>0){
            temp=n%10;
            sum+=temp;
            prod*=temp;
            n=n/10;
        }
        if(num%(sum+prod)==0){
            return true;
        }
        return false;
    }
}