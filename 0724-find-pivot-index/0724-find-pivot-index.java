class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int prefix[] = new int[nums.length+1];
        prefix[0]=sum;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            prefix[i+1]=sum;

        }
        sum=0;
        int suffix[]=new int[nums.length+1];
        suffix[nums.length]=sum;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            suffix[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            if(prefix[i]==suffix[i+1]) return i;
        }
        return -1;
    }
}