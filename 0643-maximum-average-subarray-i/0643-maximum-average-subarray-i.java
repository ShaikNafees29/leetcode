class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double s=0,maxi= Double.MIN_VALUE;
        for(int i = 0;i<k;i++){
            s+=nums[i];
        }
        maxi = s/k;
        for(int i=0;i<nums.length-k;i++){
            s+=nums[i+k]-nums[i];
            maxi = Math.max(maxi,s/k);
        }
        return maxi;
    }
}