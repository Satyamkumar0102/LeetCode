class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // To track the position for valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }
}