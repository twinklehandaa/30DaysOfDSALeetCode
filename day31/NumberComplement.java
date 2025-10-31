class Solution {
    public int findComplement(int num) {
        if (num==0) return 1;
        if (num ==1) return 0;

        String binary = Integer.toBinaryString(num);
        char[] arr = binary.toCharArray();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == '0') arr[i] = '1';
            else arr[i] = '0';
        }

        binary = new String(arr);
        return Integer.parseInt(binary, 2);

    }
}

// Input: num = 5
// Output: 2
// Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
