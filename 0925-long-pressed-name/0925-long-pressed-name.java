class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=name.length(),m=typed.length();
        int i=0,j=0;
        while(i<n && j<m){
            if(name.charAt(i)==typed.charAt(j)){
                i++;j++;
            }else if(j>0 && typed.charAt(j-1)==typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        while(j<m && typed.charAt(j-1)==typed.charAt(j)){
            j++;
        }
        return i==n && j==m;
    }

}