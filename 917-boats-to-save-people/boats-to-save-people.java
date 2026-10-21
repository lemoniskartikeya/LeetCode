import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int min = 0;
        int max = people.length-1;
        int boat = 0;

        while(min<=max){
            if(people[max]==limit){
                boat++;
                max--;
            }
            else if (people[min]+people[max]>limit){
                boat++;
                max--;
            }
            else if(people[min]+people[max]==limit){
                boat++;
                min++;
                max--;
            }
            else{
                boat++;
                min++;
                max--;
            }
        }
        return boat;
    }
}