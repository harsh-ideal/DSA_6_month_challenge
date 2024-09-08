class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp=strs[0];
        for(int i=1;i<strs.length;i++){
            String ans="";
            for(int j=0;j<Math.min(temp.length(),strs[i].length());j++){
                if(Character.compare(temp.charAt(j),strs[i].charAt(j))==0){
                    ans+=temp.charAt(j);
                }
                else
                    break;
            }
            temp=ans;
        }
        return temp;
    }
}

Link: https://leetcode.com/problems/longest-common-prefix/