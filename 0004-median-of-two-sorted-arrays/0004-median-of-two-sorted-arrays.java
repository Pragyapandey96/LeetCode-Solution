class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = merge(nums1, nums2);
        int n = nums.length;

        if(n%2 == 1){
            return nums [ n / 2 ];
        } else {
            return (nums[ n/2 - 1] + nums[n/2])/2.0;
        }

    }

        public int[] merge(int[] arr1, int[] arr2){ 
        int n = arr1.length;
        int m = arr2.length;
        int [] arr = new int[m+n];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1<n || p2<m){

        int val1 = p1 < n ? arr1[p1] : Integer.MAX_VALUE;
        int val2 = p2 < m? arr2[p2] : Integer.MAX_VALUE;

        if(val1<val2){
            arr[p3] = val1;
            p1++;
        } else {
            arr[p3] = val2;
            p2++;
        }
        p3++;
        }

        return arr;

    }
}