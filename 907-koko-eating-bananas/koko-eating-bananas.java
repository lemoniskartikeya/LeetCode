class Solution {
    public int minEatingSpeed(int[] piles, int h)
    {
        int min = 1; // can atleast eat one banana per hour
        int max = 0;
        int ans = 0;
        for(int pile : piles){
            max = Math.max(max,pile);
        }

        while(min<=max){
            int mid = min + (max-min)/2;
            if(caneat(piles, h, mid)){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return ans;
    }

    static boolean caneat(int[] piles, int h, int k){
        long count = 0;
        for (int pile: piles){
            if(pile<=k){  // if pile is smaller than eating rate per hour then eat the whole
                count++;
            }
            else{ // if pile is bigger than eat it till pile is -ve or zero
                count += (pile+k-1)/k;
                }
            }
        return h>=count;  // returns true if count is less than or equal to given hours
    }
}
