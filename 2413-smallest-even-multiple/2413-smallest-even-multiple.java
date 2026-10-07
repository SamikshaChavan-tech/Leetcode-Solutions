class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=1;i<=n;i++){
            if(2*i==n){
                return n;
            }
        }

        return 2*n;
    }
}