class Solution {
    public int lengthOfLastWord(String s) {
        String s2 = s.strip();
        int count = 0;
        for(int i = s2.length() - 1; i >= 0 && s2.charAt(i) != ' '; i--){
            count++;
        }
        return count;
    }
}