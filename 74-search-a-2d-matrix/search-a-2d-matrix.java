class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length-1;
        int SRow = 0;
        int ERow = matrix.length-1;

        while(SRow<=ERow){
            int MRow = SRow + (ERow-SRow)/2;
            if(target>matrix[MRow][n]){
                SRow = MRow+1;
            }
            else if(target<matrix[MRow][0]){
                ERow = MRow-1;
            }
            else{
                return (bs(matrix, target, MRow));
                }
            }
        return false;
        }

    

    static boolean bs(int[][] arr, int target, int row){
        int start = 0;
        int end = arr[0].length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[row][mid]>target){
                end = mid-1;
            }
            else if(arr[row][mid]<target){
                start = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
