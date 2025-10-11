class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int result = 0;
        int num = 0;
        int sign = 1;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                num = num*10 + (ch-'0');
            }
            else if (ch=='+'){
                result += sign*num;
                sign=1;
                num=0;
            }
            else if (ch=='-'){
                result += sign*num;
                sign=-1;
                num=0;
            }
            else if (ch=='('){
                st.push(result);
                st.push(sign);
                result=0;
                sign=1;;
            }
            else if (ch==')'){
                result+=num*sign;
                num = 0;
                result*=st.pop();
                result+=st.pop();
            }
        }
        if (num!=0){
            result+=sign*num;
        }
        return result;
    }
}

// Input: s = "(1+(4+5+2)-3)+(6+8)"
// Output: 23
