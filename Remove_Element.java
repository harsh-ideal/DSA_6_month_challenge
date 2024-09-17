class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                ans[count]=nums[i];
                count++;
            }
        }
        
        for(int i=0;i<count;i++){
            nums[i]=ans[i];
        }

        return count;
    }
}


Link:https://leetcode.com/problems/remove-element/