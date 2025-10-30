class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int maxEnergy = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0 ; i--){
            if (i + k < n) energy[i]+=energy[i+k];
            maxEnergy = Math.max(energy[i], maxEnergy);
        }
        return maxEnergy;
    }
}

// Input: energy = [5,2,-10,-5,1], k = 3
// Output: 3
// Explanation: We can gain a total energy of 3 by starting from magician 1 absorbing 2 + 1 = 3.
