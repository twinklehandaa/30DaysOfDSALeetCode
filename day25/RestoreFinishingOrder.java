class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int index = 0;
        for (int i = 0; i < order.length; i++){
            for (int j = 0; j < friends.length; j++){
                if (order[i] == friends[j]){
                    result[index++] = order[i];
                    break;
                }
            }
        }
        return result;
    }
}

// Input: order = [3,1,2,5,4], friends = [1,3,4]
// Output: [3,1,4]
// Explanation:
// The finishing order is [3, 1, 2, 5, 4]. Therefore, the finishing order of your friends is [3, 1, 4].
