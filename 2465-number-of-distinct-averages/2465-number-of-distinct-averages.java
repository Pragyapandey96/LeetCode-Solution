import java.util.Arrays;

class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n-1;

        HashSet<Integer> set = new HashSet<>();

        while(left < right){
            int sum = nums[left] + nums[right];

            set.add(sum);

            left++;
            right--;
        }  
        return set.size();      
    }
}