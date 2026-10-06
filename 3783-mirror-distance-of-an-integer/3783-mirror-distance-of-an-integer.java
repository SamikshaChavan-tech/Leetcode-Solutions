class Solution {
    public int mirrorDistance(int n) {
        int a=n;
        int reverse=0;
        while(n>0){
            int temp=n%10;
            reverse=10*reverse+temp;
            n=n/10;
        }
        return Math.abs(a-reverse);
    }
}