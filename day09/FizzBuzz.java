class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            if (i%3==0 && i%5==0){
                fb.add("FizzBuzz");
            }
            else if (i%5==0){
                fb.add("Buzz");
            }
            else if (i%3==0){
                fb.add("Fizz");
            }
            else{
                String s = Integer.toString(i);
                fb.add(s);
            }
        }
        return fb;
    }
}

// Example :
// Input: n = 5
// Output: ["1","2","Fizz","4","Buzz"]
