class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x = num;
        while (t!=0){
            x+=2;
            t--;
        }
        return x;
    }
}

// Input: num = 4, t = 1
// Output: 6

// | Move  | num | x | What happened       | Gap between x & num |
// | ----- | --- | - | ------------------- | ------------------- |
// | Start | 3   | 3 | starting point      | 0                   |
// | 1️⃣   | 4   | 5 | both increased by 1 | 2                   |
// | 2️⃣   | 5   | 6 | both increased by 1 | 2                   |
// | 3️⃣   | 6   | 7 | both increased by 1 | 2                   |
