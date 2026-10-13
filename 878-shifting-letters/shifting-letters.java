class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();

        int total_shift = 0;

        for(int i = s.length()-1;i>=0;i--){
            total_shift = (total_shift + shifts[i] % 26) % 26;
            chars[i] = (char)('a'+((chars[i]-'a'+total_shift)%26));

        }
        return new String(chars);
    }
}