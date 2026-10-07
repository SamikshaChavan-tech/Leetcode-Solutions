class Solution {
    public int missingNumber(int[] nums) {
        // Solution 1
    //   for(int i=0;i<=nums.length;i++){
    //     int flag=0;
    //     for(int j=0;j<nums.length;j++){
    //         if(i==nums[j]){
    //             flag=1;
    //         }
    //     }if(flag==0){
    //         return i;
    //     }
    //   }
    //   return 0;
//     }
// }

// Solution 2

//     int flag=0;

//     int [] result=new int[nums.length+1];
//     int j=0;
//     while(j<nums.length){
//     for(int i=0;i<result.length;i++){
//         if(nums[j]==i){
//             result[i]=1;
//         }
//     }
//     j++;
//     }
//     for(int i=0;i<result.length;i++){
//         if(result[i]==0){
//             return i;
//         }
//     }
//     return 0;
//     }
// }

// solution 3

int sum=(nums.length*(nums.length+1))/2;
int sum2=0;
for(int i=0;i<nums.length;i++){
    sum2 += nums[i];
}
int result=sum-sum2;
return result;

    }
}
