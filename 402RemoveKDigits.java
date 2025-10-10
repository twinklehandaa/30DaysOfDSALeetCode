class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for (char digit: num.toCharArray()){
            while (k>0 && !st.isEmpty() && st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
            
        }
        while (k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch:st){
            sb.append(ch);
        }
        while (!sb.isEmpty() && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if (sb.length()==0){
            return "0";
        }
        return sb.toString();
    }
}

// Input: num = "10200", k = 1
// Output: "200"
// Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
