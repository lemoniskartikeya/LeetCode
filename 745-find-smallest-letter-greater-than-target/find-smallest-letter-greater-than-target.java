class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high =  letters.length-1;
        char ans = 0;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(letters[mid]>target){
                ans = letters[mid];
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(ans!=0){
            return ans;
        }
        return letters[0];
    }
}