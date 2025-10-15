class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while (num>=10){
            sum = 0;
            while (num>0){
                int temp = num%10; // use last digit 
                sum+=temp;
                num/=10; // break the digit
            }
            num = sum;
        }
        return num;
    }
}

// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
