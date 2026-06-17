class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        ArrayList<Character> al = new ArrayList<>();
        for(char ch:jewels.toCharArray()){
            al.add(ch);
        }
        for(char ch: stones.toCharArray()){
            if(al.contains(ch)){
                count++;
            }
        }
        return count;
    }
}