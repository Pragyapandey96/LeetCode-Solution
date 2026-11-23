class Solution {
    public int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            } else if(nums[i] < min){
                min = nums[i];
            }else {
                continue;
            }
        }

        int counter = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > min && nums[i] < max){
                counter++;
            }
        }
        return counter;
    }
}