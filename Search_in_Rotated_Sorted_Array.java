class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums[nums.length];
        while(i<=j){
            if(nums[i]==target){
                return i;
            }else if(nums[j]==target){
                return j;
            }
            int mid=(i+j)/2;
            if(nums[i]<target && nums[mid]<target){
                j=mid;
            }else if(nums[i]<target && nums[mid]>target){
                i=mid;
            }else if(nums[]){

            }
        }
    }
}

Link: https://leetcode.com/problems/search-in-rotated-sorted-array/