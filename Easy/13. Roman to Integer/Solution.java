// https://leetcode.com/problems/roman-to-integer/
class Solution {
    public static int value(char s) {
        if (s == 'I') return 1;
        if (s == 'V') return 5;
        if (s == 'X') return 10;
        if (s == 'L') return 50;
        if (s == 'C') return 100;
        if (s == 'D') return 500;
        if (s == 'M') return 1000;
        return 0;
    }

    public boolean check(int i, String s) {
        if (i + 1 < s.length()) {
            if (value(s.charAt(i + 1)) > value(s.charAt(i)))
                return true;
        }
        return false;
    }

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (check(i, s))
                        res -= 1;
                    else
                        res += 1;
                    break;
                case 'V':
                    if (check(i, s))
                        res -= 5;
                    else
                        res += 5;
                    break;
                case 'X':
                    if (check(i, s))
                        res -= 10;
                    else
                        res += 10;
                    break;
                case 'L':
                    if (check(i, s))
                        res -= 50;
                    else
                        res += 50;
                    break;
                case 'C':
                    if (check(i, s))
                        res -= 100;
                    else
                        res += 100;
                    break;
                case 'D':
                    if (check(i, s))
                        res -= 500;
                    else
                        res += 500;
                    break;
                case 'M':
                    if (check(i, s))
                        res -= 1000;
                    else
                        res += 1000;
                    break;
            }
        }
        return res;
    }
}