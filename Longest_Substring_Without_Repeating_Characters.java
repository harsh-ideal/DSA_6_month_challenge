class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int maxCount=0;
        System.out.println(s.length());
        int st=0;
        for(int i=0;i<s.length();i++){
            int index=checkExistance(s,st,i);
            if(index==-1){
                count++;
            }else{
               maxCount=Math.max(maxCount,count);
                i=index+1;
                st=index+1;
                count=1;
            }
        }
        return Math.max(count,maxCount);
    }
    public int checkExistance(String str,int st,int end){
        
        for(int i=st;i<end;i++){
            if(str.charAt(i)==str.charAt(end)){
                return i;
            }
        }
        return -1;
    }
}


Link:https://leetcode.com/problems/longest-substring-without-repeating-characters/