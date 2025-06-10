class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int first=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[first]=nums[i];
                first++;
            }


        }
        for(int j=first;j<n;j++)
        {
            nums[first]=0;
            first++;
        }

    }
}   