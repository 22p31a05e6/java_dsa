class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // frequency array (values are 1..50)
        int[] freq = new int[51];

        // build first window
        for (int i = 0; i < k; i++) {
            freq[nums[i]]++;
        }

        ans[0] = calculateXSum(freq, x);

        // sliding window
        for (int i = k; i < n; i++) {
            freq[nums[i - k]]--; // remove left
            freq[nums[i]]++;     // add right
            ans[i - k + 1] = calculateXSum(freq, x);
        }

        return ans;
    }

    private int calculateXSum(int[] freq, int x) {
        int sum = 0;
        boolean[] used = new boolean[51];

        // pick top x frequent values
        for (int count = 0; count < x; count++) {
            int bestVal = -1;
            int bestFreq = 0;

            for (int v = 1; v <= 50; v++) {
                if (!used[v] && freq[v] > 0) {
                    if (freq[v] > bestFreq ||
                       (freq[v] == bestFreq && v > bestVal)) {
                        bestFreq = freq[v];
                        bestVal = v;
                    }
                }
            }

            if (bestVal == -1) break;

            used[bestVal] = true;
            sum += bestFreq * bestVal;
        }

        return sum;
    }
}
