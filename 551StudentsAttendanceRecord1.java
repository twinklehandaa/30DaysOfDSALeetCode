class Solution {
    public boolean checkRecord(String s) {
        int countAbsent = 0;
        int countLate = 0;
        
        for (char ch : s.toCharArray()){
            if (ch=='A') {
                countAbsent++;
                if (countAbsent>=2) return false;
            }
            if (ch=='L'){
                countLate++;
                if (countLate>=3) return false;
            }
            else countLate=0;
        }
        return true;
    }
}

// Input: s = "PPALLP"
// Output: true
// Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.
