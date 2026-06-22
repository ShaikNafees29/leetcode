class Solution {
    public int findMin(int[] nums) {
        int l = 0,r=l+1;
        while(r<nums.length){
            if(nums[l]>=nums[r]){
                return nums[r];
            }
            else{
                l++;
                r++;
            }
        }
        return nums[0];
    }
}