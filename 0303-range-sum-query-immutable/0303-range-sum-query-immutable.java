class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        int s=0;
        this.arr=new int[nums.length+1];
        arr[0]=s;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            this.arr[i+1]=s;
        } 
    }
    
    public int sumRange(int left, int right) {
        return this.arr[right+1]-this.arr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */