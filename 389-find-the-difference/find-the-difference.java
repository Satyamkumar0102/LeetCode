class Solution {
        public static int allOccurences(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char ch = 'a';
        int n = t.length();
        for (int i = 0; i < n; i++) {
            char c = t.charAt(i);
            int tcount = allOccurences(t, c);
            int scount = allOccurences(s, c);
            if (tcount != scount) {
                return c;
            }
        }
        return ch;
    }
}