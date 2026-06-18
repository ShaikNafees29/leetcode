class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele:nums1){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int ele:nums2){
            if(hm.containsKey(ele) && hm.get(ele)>=1){
                al.add(ele);
                hm.put(ele,hm.get(ele)-1);
            }
        }
        int res[] = new int[al.size()];
        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }
        return res;
    }
}