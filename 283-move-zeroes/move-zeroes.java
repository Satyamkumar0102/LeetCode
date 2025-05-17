class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=0;
        int target=0;
       for(int i=0;i<n;i++)
       {
            if(nums[i]!=target)
            {
                nums[index++]=nums[i];
            }
       }
            while(index<n)
            {
                nums[index++]=target;
            }       
    }
}