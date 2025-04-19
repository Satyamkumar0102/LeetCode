// class Solution {
//     public long countFairPairs(int[] nums, int lower, int upper) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         long count= 0;
//         for(int i=0;i<n;i++){
//             int left=i+1;
//             int right=n-1;
//             while(left<=right){
//                 int sum=nums[i]+nums[left];
//                 if(sum>=lower){
//                     break;
//                 }
//                  left++;
//             }
//             while(left<=right){
//                  int sum=nums[i]+nums[right];
//                 if(sum<=upper){
//                     break;
//                 }
//                  right--;
//             }
//             if(left<=right){
//                 count=count+(right-left+1);
//             }

//             }
//          return count;
//     }
// }

import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums); // Step 1: Sort the array
        int n = nums.length;
        long count = 0;

        for (int i = 0; i < n; i++) {
            // Use binary search to find `left` and `right`
            int left = binarySearch(nums, i + 1, n - 1, lower - nums[i], true);
            int right = binarySearch(nums, i + 1, n - 1, upper - nums[i], false);

            // Count valid pairs if there are any
            if (left <= right) {
                count += (right - left + 1);
            }
        }

        return count;
    }

    // Binary search helper function
    private int binarySearch(int[] nums, int start, int end, int target, boolean findLowerBound) {
        int result = findLowerBound ? end + 1 : start - 1; // Default return value if no valid index is found
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((findLowerBound && nums[mid] >= target) || (!findLowerBound && nums[mid] <= target)) {
                result = mid;
                if (findLowerBound) {
                    end = mid - 1; // Move left to find the lower bound
                } else {
                    start = mid + 1; // Move right to find the upper bound
                }
            } else {
                if (findLowerBound) {
                    start = mid + 1; // Move right if nums[mid] is too small
                } else {
                    end = mid - 1; // Move left if nums[mid] is too large
                }
            }
        }
        return result;
    }
}

