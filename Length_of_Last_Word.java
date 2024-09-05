class Solution {
    public int lengthOfLastWord(String s) {
        String str="";
        String current="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(current!="")str=current;
                current="";
             System.out.println(str);
            }else{
            current+=s.charAt(i);
            }
        }

        if(current!=""){
            
            str=current;
            System.out.println(str);
        }
        return str.length();
    }
}


Link: https://leetcode.com/problems/length-of-last-word/