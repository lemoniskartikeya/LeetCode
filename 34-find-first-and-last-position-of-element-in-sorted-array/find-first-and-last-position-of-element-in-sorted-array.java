class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[]{-1,-1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        arr[0] = start;
        arr[1] = end;

        return arr;

    }

    static int search(int[] nums, int target, boolean FindStartIndex){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                ans = mid;
                if(FindStartIndex){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return ans;
    }
}