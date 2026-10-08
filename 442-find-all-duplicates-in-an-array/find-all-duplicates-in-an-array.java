import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> ans = new ArrayList<>();

        for(int index = 0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int one, int two, int[] arr){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}