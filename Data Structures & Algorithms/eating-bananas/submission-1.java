class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int pile:piles){
            right = Math.max(right,pile);
        }
        int ans = right;

        while(left<right){
            int mid = left + (right - left)/2 ;
        

        long totalTime = 0 ;
 
        for(int pile : piles){
            totalTime += (pile + mid - 1) / mid;
        }
        if(totalTime <= h){
         right = mid ;
        }
        else{
            left = mid + 1;
        }
        }
        return left;
    }
}
