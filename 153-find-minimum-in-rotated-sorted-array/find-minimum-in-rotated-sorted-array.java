class Solution {
    public int findMin(int[] nums) {

        if(nums[0]<=nums[nums.length-1]){
            return nums[0];
        }
        int p = pivot(nums);

        return nums[p+1];
    }

    static int pivot(int[] nums){
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid+1<=high && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if (mid-1>=low && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}