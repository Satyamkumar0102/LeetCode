import java.lang.Integer;
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length; 
        int currentSum =0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            currentSum=currentSum+nums[i];
            if(currentSum> maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}