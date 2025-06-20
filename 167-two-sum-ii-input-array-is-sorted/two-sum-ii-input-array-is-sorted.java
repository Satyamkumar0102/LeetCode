class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] nums = new int[2];
        int l = 0;
        int r = numbers.length-1;
        while (l < r) {

            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                nums[0] = l + 1;
                nums[1] = r + 1;
                break;
            }
            else if(sum<target){
                l++;

            }
            else
            {
                r--;
            }
        }
        return nums;
    }
}