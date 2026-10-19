class Solution {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int place = nums.length-1;
        int[] ans = new int[nums.length];
        while(low<=high && place>=0){
            if(Math.abs(nums[low])>Math.abs(nums[high])){
                ans[place] = nums[low]*nums[low];
                low++;
                place--;
            }
            else{
                ans[place] = nums[high]*nums[high];
                high--;
                place--;

            }
        }
        return ans;
    }
}