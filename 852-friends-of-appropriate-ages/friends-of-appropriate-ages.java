class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121]; // Age range: 1 to 120
        for (int age : ages) {
            count[age]++;
        }
        
        int requests = 0;
        
        for (int A = 15; A <= 120; A++) { // Min valid age for requests
            if (count[A] == 0) continue;
            for (int B = A / 2 + 8; B <= A; B++) {
                if (count[B] == 0) continue;
                requests += count[A] * (count[B] - (A == B ? 1 : 0)); // Exclude self requests
            }
        }
        
        return requests;
    }
}