class Solution {
    public int splitArray(int[] nums, int k)
    {
        int min = 0;
        int max = 0;
        int ans = 0;

        for(int i : nums){
            min = Math.max(min,i);
            max = max+i;
        }

        while(min<=max){
            int mid = (max+min)/2;

            if(canfit(nums, k, mid)){
                ans = mid;
                max = mid-1;
            }
            else{
                min= mid+1;
            }

        }
        return ans;

    }
    static boolean canfit(int[] nums, int k, int peak){
        int count = 1;
        int sum = 0;
        for(int i:nums) {
            if ((sum + i) > peak) {
                count++;
                sum = i;
            } else {
                sum = sum+i;
            }
        }
        return k>=count;
    }
}




