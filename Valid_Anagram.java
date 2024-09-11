class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] str1=new char[s.length()];
        char[] str2=new char[t.length()];

        for(int i=0;i<str1.length;i++){
            str1[i]=s.charAt(i);
            str2[i]=t.charAt(i);
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0;i<str1.length;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;
    }
}

Link: https://leetcode.com/problems/valid-anagram/