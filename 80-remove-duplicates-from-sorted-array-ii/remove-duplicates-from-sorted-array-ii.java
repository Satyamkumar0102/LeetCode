class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l=0;
        int r=0;
        int index=0;
        while(l<n)
        {
            while(r<n && nums[l]==nums[r])
            {
                r++;
            }
            int frequency=r-l;
            if(frequency==1)
            {
                nums[index]=nums[l];
                index++;
            }
            else
            {
                nums[index]=nums[l];
                index++;
                nums[index]=nums[l];
                index++;
            }
            l=r;
        }
        return index;
    }
}