class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        for(int j=0; j<nums.length; j++){
            if(k < 2 || nums[j] != nums[k-2]){
                nums[k] = nums[j];
                k = k + 1;
            }
        }
        return k;
    }
}