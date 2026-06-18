class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int mini =Math.min(word1.length(),word2.length()); 
        for(int i=0;i<mini;i++){
            s=s+word1.charAt(i)+word2.charAt(i);
        }
        s+=word1.substring(mini,word1.length() ) ;
        s+=word2.substring(mini, word2.length());
        return s;
    }
}
