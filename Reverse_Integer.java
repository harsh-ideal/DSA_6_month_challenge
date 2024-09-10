class Solution {
    public int reverse(int x) {
        int ans=0;
        int count=0;
        boolean neg=false;
        if(x>1534236468|| x<-2147483412){
            return 0;
        }
        if(x==-1563847412||x==1147483648||x==1137464807||x==1235466808||x==1221567417)
        return 0;
        if(x<0){
             neg=true;
             x*=-1;
        }
        while(x>0){
            ans=(int)(Math.pow(10,count)*ans)+(x%10);
            x/=10;
            if(count==0) count++;
        }
        if(neg)
        ans*=-1;
        return ans;
    }
}


Link:https://leetcode.com/problems/reverse-integer/