import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()==t.length()){
        char[] arr=s.toCharArray();
        char[] brr=t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        for(int i=0;i<s.length();i++){
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;
      }
      return false;
    }
}