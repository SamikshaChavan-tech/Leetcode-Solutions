class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0;
        int number=x;
         while(number!=0){
            int temp=number%10;
            number=number/10;
            reversed=reversed*10+temp;
         }
         if(x<0){
            return false;
         }

         if(x==reversed){
            return true;
         }else{
            return false;
         }

 
    }
}