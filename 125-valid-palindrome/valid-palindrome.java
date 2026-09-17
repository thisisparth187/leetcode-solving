class Solution {
    public static boolean fn(int l, String str, int n){
        if(l>=n/2) return true;
        if(str.charAt(l) != str.charAt(n-l-1)) return false;
        return fn(l+1, str, n);
    }

    public boolean isPalindrome(String s) {
        String trim_string = s.replaceAll("[^a-zA-Z0-9]", "");
        trim_string = trim_string.toLowerCase();
        System.out.println(trim_string);
        return fn(0,trim_string, trim_string.length());
    }
}