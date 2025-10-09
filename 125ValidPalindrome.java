class Solution {
    public boolean isPalindrome(String s) {
        // Remove leading/trailing spaces
        s = s.trim();

        // Replace punctuation marks with space (your way)
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Correct check for empty string
        if (s.isEmpty()) return true;

        // Reverse the string
        StringBuilder newstr = new StringBuilder(s);
        newstr.reverse();
        String s2 = newstr.toString();

        // Compare original and reversed
        return s.equals(s2);
    }
}
// Example:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
