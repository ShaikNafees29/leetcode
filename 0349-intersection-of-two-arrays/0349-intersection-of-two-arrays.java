class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int ele:nums1){
            hs1.add(ele);
        }
        for(int ele: nums2){
            if(hs1.contains(ele)){
                hs2.add(ele);
            }
        }
        int res[]=new int[hs2.size()];
        int i=0;
        for(int ele: hs2){
            res[i]=ele;
            i++;
        }
        return res;
    }
}