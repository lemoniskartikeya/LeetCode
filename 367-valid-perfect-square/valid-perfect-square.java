class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == num) {
                return true;
            }
            else if ((long) mid * mid < num) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}