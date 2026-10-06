class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x;
        int temp=x;
        int sum=0;
        while(temp>0){
            x=temp%10;
            sum+=x;
            temp=temp/10;
        }
        if(a%sum==0){
            return sum;
        }
        return -1;
    }
}