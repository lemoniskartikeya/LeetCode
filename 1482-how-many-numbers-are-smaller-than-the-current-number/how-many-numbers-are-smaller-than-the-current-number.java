class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
        int max = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]>nums[j]){
                max++;
            }
        }
        count[i] = max;
        }
        return count;
    }
}