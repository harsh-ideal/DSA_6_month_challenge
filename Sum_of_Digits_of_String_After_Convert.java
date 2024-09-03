class Solution {
    public int getLucky(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
            str+=((s.charAt(i)-'a')+1);
        }
        int ans;
        for(int i=0;i<k;i++){
            ans=0;
            for(int j=0;j<str.length();j++){
                ans+=str.charAt(j)-'0';
            }
            if(i==k-1){
                return ans;
            }
            str=Integer.toString(ans);
            
        }
        return 0;
    }
}

Link:https://leetcode.com/problems/sum-of-digits-of-string-after-convert/?envType=daily-question&envId=2024-09-03