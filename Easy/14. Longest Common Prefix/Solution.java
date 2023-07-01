// https://leetcode.com/problems/longest-common-prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pr = strs[0];
        for (String s: strs){
            if (s.length()<pr.length()) 
                pr=pr.substring(0, s.length());
            while (!pr.equals(s.substring(0,pr.length()))) {
                pr =pr.substring(0, pr.length()-1);
            }
        }
        return pr;
    }
}