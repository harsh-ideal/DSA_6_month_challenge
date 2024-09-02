public class Solution {
    public int strStr(String haystack, String needle) {
 if (needle.isEmpty()) {
            return 0;
        }
 return haystack.indexOf(needle);
    }
}

Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/