class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int clossestSum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(Math.abs(target-sum)<Math.abs(target-clossestSum)){
                    System.out.println(sum+""+nums[i]+""+nums[j]+""+nums[k]+""+clossestSum);
                    clossestSum=sum;
                }
                    if(sum<target){
                        j++;
                    }else{
                        k--;
                    }
                
            }
        }
        return clossestSum;
    }
}


Link: https://leetcode.com/problems/3sum-closest/