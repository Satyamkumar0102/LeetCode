import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < 256; i++) {
            map.put((char) i, -1);
        }

        int n = s.length();
        int l = 0, r = 0, maxlength = 0;

        while (r < n) {
            if (map.get(s.charAt(r)) != -1) {
                if (map.get(s.charAt(r)) >= l) {
                    l = map.get(s.charAt(r)) + 1;
                }
            }
            int len = r - l + 1;
            maxlength = Math.max(len, maxlength); 
            map.put(s.charAt(r), r); 
            r++;
        }

        return maxlength;
    }
}
