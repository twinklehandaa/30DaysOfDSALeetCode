class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+"); // split by one or more spaces->split string into words
        StringBuilder result = new StringBuilder();
        for (int i = words.length-1; i>=0; i--){ //traverse in reverse order and append.
            result.append(words[i]);
            if (i>0) result.append(" ");
        }
        return result.toString();
    }
}

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
