class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p1=1,p2=1,c=0;
        for(int i:nums){
            p1*=i;
            if(i!=0){
                p2*=i;
            }
            else{
                c++;
            }
        }
        if(c>1){
            for(int i =0;i<nums.length;i++){
                nums[i]=0;
            }
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[i]=(int) p1/nums[i];
            }
            else{
                nums[i]=p2;
            }
        }
        return nums;
    }
}