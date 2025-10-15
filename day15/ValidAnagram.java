class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] count = new int[26]; //frequency count
        
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i)-'a']++; 
            //s.charAt(i)-'a' convert character to index for ex ('b'-'a') = 98-97 = 1;
        }
        for (int i = 0; i < t.length(); i++){
            count[t.charAt(i)-'a']--; //make it back to 0 for verification
        }
        for (int c : count){
            if (c!=0) return false;
        }

        return true;
    }
}

// Anagram Definition:

// Two strings are anagrams if they contain exactly the same characters
// The same quantity of each character
// Characters can be in any order
// All original letters must be used exactly once
  
// Input: s = "anagram", t = "nagaram"
// Output: true

// Input: s = "rat", t = "car"
// Output: false
