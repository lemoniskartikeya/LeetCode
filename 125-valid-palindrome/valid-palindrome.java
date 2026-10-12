
class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {

            if (!Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            }

            else if (!Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }
            else {
                if (Character.toLowerCase(s.charAt(low)) !=
                    Character.toLowerCase(s.charAt(high))) {
                    return false;
                }

                low++;
                high--;
            }
        }

        return true;
    }
}
