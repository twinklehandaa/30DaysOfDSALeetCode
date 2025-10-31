class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minIndex = Integer.MAX_VALUE;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < list1.length; i++){
            for (int j = 0; j < list2.length; j++){
                if (list2[j].equals(list1[i])) {
                    int sum = i + j;
                    if (sum < minIndex) {
                        ans.clear();
                        ans.add(list2[j]);
                        minIndex = sum;
                    }
                    else if (sum == minIndex) ans.add(list2[j]);
                }
            } 
        }
        return ans.toArray(new String[0]);
    }
}

// Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
// Output: ["sad","happy"]
// Explanation: There are three common strings:
// "happy" with index sum = (0 + 1) = 1.
// "sad" with index sum = (1 + 0) = 1.
// "good" with index sum = (2 + 2) = 4.
// The strings with the least index sum are "sad" and "happy".
