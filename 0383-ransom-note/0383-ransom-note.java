class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int crr[] = new int[26];
        for(char ch : magazine.toCharArray()){
            crr[ch-97]++;
        }
        for(char ch : ransomNote.toCharArray()){
            crr[ch-97]--;
            if(crr[ch-97]<0){
                return false;
            }
        }
        return true;
    }
}