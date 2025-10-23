class Solution {
    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String reverseVowels(String s) {
        if (s==null || s.length()==0) return s;
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            while (start<end && !isVowel(arr[start])) start++;
            while (start<end && !isVowel(arr[end])) end--;

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        } 
        return new String(arr);
    }
}

// Input: s = "IceCreAm"
// Output: "AceCreIm"

// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
