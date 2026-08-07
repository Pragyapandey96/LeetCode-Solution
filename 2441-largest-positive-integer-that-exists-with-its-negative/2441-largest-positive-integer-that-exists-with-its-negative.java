import java.util.Arrays;

class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int result = -1;
        Arrays.sort(nums);

       

        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == 0){
               
                result = Math.max(result, Math.abs(nums[left]));
                left++ ;
                 right--;
            }
            else if(sum > 0){
               right--;
            }
            else{
                left++;
            }
            
        }
       
        return result;
    }
}