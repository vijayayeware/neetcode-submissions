class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        StringBuffer sb = new StringBuffer(s);
        String sb1 = sb.reverse().toString();
        if (sb1.equals(s)){
            return true;
        }
        return false;
    }
}
