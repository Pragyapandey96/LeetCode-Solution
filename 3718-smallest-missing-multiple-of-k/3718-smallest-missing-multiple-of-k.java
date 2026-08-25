class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int max = nums[0];

        for(int num: nums){
            set.add(num);
            
        }

        // for(int m=k; m<=max; m+=k){
        //     if(!set.contains(m))
        //     return m;
        // }

        int i = 1;

        while(true){
            int ans =  k*i;
            if(!set.contains(ans)){
             return ans;
            }
            i++; 
        }

    }
}