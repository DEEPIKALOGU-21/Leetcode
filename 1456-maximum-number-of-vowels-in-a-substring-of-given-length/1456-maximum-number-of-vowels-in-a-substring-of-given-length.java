class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxvow = 0;

        for (int i = 0; i < s.length(); i++) {

            // Add the new character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // Remove the character that is outside the window
            if (i >= k) {
                if (isVowel(s.charAt(i - k))) {
                    count--;
                }
            }

            // Update maximum after we have a full window
            if (i >= k - 1) {
                maxvow = Math.max(maxvow, count);
            }
        }

        return maxvow;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}