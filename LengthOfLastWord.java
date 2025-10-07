//58. Length of Last Word

// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

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
