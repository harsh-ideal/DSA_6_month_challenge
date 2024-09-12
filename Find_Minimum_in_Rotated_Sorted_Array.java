class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }else if(nums.length==2){
            return Math.min(nums[0],nums[1]);
        }else if(nums[i]<nums[j]){
            return nums[i];
        }
       while(i<j){
        if(i==(j-1)){
            return nums[j];
        }
            int mid=(i+j)/2;
            if(nums[mid]>nums[i]){
                i=mid;
            }else if(nums[mid]<nums[i]){
                j=mid;
            }
        }
        return 0;
    }
}


Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/