class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
         int l=0;
         int r=0;
         int index=0;
         while(l<n)
         {
            while(r<n &&nums[l]==nums[r])
            {
                r++;
            }
            nums[index]=nums[l];
            index++;
            l=r;
         }
    return index;
}
}