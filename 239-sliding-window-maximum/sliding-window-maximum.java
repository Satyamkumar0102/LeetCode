import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {  
            while (!dq.isEmpty() && dq.peekFirst() <= (i - k)) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) { 
                dq.removeLast();
            }
            dq.addLast(i);

            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];          
            }
        }

        return ans;
    }
}