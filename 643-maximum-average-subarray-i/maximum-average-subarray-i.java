
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double newSum = 0;
        double maxSum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxSum = sum;

        for (int j = k; j < nums.length; j++) {
            newSum = sum + nums[j];
            newSum = newSum - nums[j-k];

            sum = newSum;
            maxSum = Math.max(maxSum, newSum);
        }

        return maxSum / k;
    }
}
