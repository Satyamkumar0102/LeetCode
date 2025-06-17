class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
         int lsum=0;
          int rsum=0;
          int maxsum=0;
        for(int i=0;i<k;i++)
        {
            lsum=lsum+cardPoints[i];
          
           

        }
          maxsum=lsum;
        int index=n-1;
        for(int j=k-1;j>=0;j--){
            lsum=lsum-cardPoints[j];
            rsum=rsum+cardPoints[index];
            index=index-1;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}