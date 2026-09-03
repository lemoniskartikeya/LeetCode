class Solution {
    public int search(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length-1;
        int pivot = pivot(nums);

        if (pivot == -1) {
            return bs(nums, target, 0, nums.length - 1); // array never rotated
        }

        if(nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[low]){
            return bs(nums, target, 0, pivot-1);
        }
        return bs(nums, target, pivot+1, high);
    }



    static int bs(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }




    static int pivot(int[] nums){

        int low = 0;
        int high = nums.length-1;

        while(low<high){
            int mid = low + (high-low)/2;

            if(mid<high && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>low && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[low]<nums[mid]){
                low = mid+1;
            }
            else if(nums[low]>=nums[mid]){
                high = mid-1;
            }
        }
        return -1;
    }
}