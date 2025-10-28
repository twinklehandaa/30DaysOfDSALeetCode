class Solution {
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++){
            int moves = 0;
            for (int j = 0; j < boxes.length(); j++){
                if (boxes.charAt(j)=='1') moves+=Math.abs(i-j);
            }
            answer[i] = moves;
        }
        return answer;
    }
}

// Input: boxes = "110"
// Output: [1,1,3]
// Explanation: The answer for each box is as follows:
// 1) First box: you will have to move one ball from the second box to the first box in one operation.
// 2) Second box: you will have to move one ball from the first box to the second box in one operation.
// 3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.
