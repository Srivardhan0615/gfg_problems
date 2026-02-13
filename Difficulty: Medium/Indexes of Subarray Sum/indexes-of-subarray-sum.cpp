class Solution {
public:
    vector<int> subarraySum(vector<int> &arr, int target) {
        int n = arr.size();
        int left = 0;
        long long sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            // Shrink window if sum exceeds target
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            // If sum found
            if (sum == target) {
                return {left + 1, right + 1}; // 1-based indexing
            }
        }

        return {-1};
    }
};