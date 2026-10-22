class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int newSum = 0;

        int sum_th = threshold*k;

        for(int i = 0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=sum_th){
                count++;
            }
        for(int j = k;j<arr.length;j++){
            newSum = sum+arr[j];
            newSum = newSum - arr[j-k];

            sum = newSum;

            if(newSum>=sum_th){
                count++;
            }
        }
        return count;
    }
}