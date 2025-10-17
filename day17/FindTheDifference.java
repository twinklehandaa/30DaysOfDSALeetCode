class Solution {
    public char findTheDifference(String s, String t) {
        int scount = 0;
        int tcount = 0;

// Add all ASCII values and subtract from string t to check whoch is added.
        for (int i = 0; i<s.length(); i++) scount+=(int)s.charAt(i);
        for (int i = 0; i<t.length(); i++) tcount+=(int)t.charAt(i);

        return (char)(tcount-scount);
    }
}

// Input: s = "abcd", t = "abcde"
// Output: "e"
// Explanation: 'e' is the letter that was added.
