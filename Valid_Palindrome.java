class Solution {
    public boolean isPalindrome(String s) {
        String orignal="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                orignal+=Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println(orignal);
        int i=0, j=orignal.length()-1;
        while(j>i){
            if(orignal.charAt(i)!=orignal.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


Link:https://leetcode.com/problems/valid-palindrome/