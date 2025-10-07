// Example :

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        return str[(str.length)-1].length();
    }
}
