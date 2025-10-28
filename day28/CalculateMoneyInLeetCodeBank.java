class Solution {
    public int totalMoney(int n) {
        // int total = 0;
        int weeks = n/7;
        int remDays = n%7;
        int total = 0;
        for (int i = 0; i < weeks; i++){
            total += 28 + 7*i;
        }

        // for remaining days
        for (int i = 0; i < remDays; i++){
            total+=(weeks+1+i);
        }
        
        return total;
    }
}
// Each week, you deposit money like this:

// | W | M | Tu | W | Th | F | Sa | Su | Sum|
// |---|---|----|---|----|---|----|----|----|
// | 1 | 1 | 2  | 3 | 4  | 5 | 6  | 7  | 28 |
// | 2 | 2 | 3  | 4 | 5  | 6 | 7  | 8  | 35 |
// | 3 | 3 | 4  | 5 | 6  | 7 | 8  | 9  | 42 |

// Input: n = 10
// Output: 37
// Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
