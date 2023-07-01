// https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        String xS =Integer.toString(x), rS="";
        char c;
        for (int i = 0; i < xS.length(); i++) {
            c = xS.charAt(i); 
            rS = c+rS; 
        }
        if(xS.equals(rS))
            return true;
        return false;
    }
}