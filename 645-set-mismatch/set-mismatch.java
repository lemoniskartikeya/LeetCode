class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        while(i<nums.length){
            int correct = nums[i]-1;

            if(nums[i]!=nums[correct]){
                swap(i, correct, nums);
            }
            else{
                i++;
            }
        }
        int ans=0;
        int num=0;

        for(int index = 0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans = nums[index];
                num = index+1;
            }
        }
        return new int[]{ans,num};
    }

    static void swap(int one, int two, int[] arr){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
