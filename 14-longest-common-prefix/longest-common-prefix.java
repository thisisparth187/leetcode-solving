class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }
        String temp = strs[0];

        for (String current : strs) {

            int j = 0;
            while(j < current.length() && j < temp.length() && temp.charAt(j) == current.charAt(j)){
                j++;
            }

            temp = temp.substring(0, j);

            if (temp.isEmpty()) {
                return temp;
            }
        }

        return temp;
    }
}