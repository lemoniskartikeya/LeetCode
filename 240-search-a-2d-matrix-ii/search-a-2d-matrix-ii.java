class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int min = 0;
        int max = matrix[0].length - 1;

        while(min < matrix.length && max >= 0) {

            if(target < matrix[min][max]) {
                max--;
            }
            else if(target > matrix[min][max]) {
                min++;
            }
            else {
                return true;
            }
        }

        return false;
    }
}