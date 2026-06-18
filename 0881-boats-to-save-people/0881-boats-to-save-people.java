class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,c=0,j=people.length-1;
        while(i<=j){
            if(i==j && people[i]<=limit){
                c++;
                break;
            }
            else if(people[i]+people[j]>limit){
                j--;
                c++;
            }
            else {
                i++;
                j--;
                c++;
            }
        }
        return c;
    }
}