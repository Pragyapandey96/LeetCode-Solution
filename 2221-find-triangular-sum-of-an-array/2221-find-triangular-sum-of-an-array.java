class Solution {
    public int triangularSum(int[] nums) {

       int n = nums.length; 
       int result = nums[0];
       while(nums.length != 1){
        int[] ans = new int[n-1]; 
         for(int i=0; i<n-1; i++){
          int num = (nums[i] + nums[i+1]) % 10;
          ans[i] = num; 
        }
         nums = ans;
          n--;
         result = nums[0];
       }
       return result;
    }
}