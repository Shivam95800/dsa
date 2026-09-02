class Solution{
public int maximumCount(int[] nums) {

    
    int lo = 0;
    int hi = nums.length - 1;
    int idx = -1;

    while (lo <= hi) {

        int mid = (lo + hi) / 2;

        if (nums[mid] >= 0) {
            idx = mid;
            hi = mid -1;
        } else {
            lo = mid +1;
        }
    }

    int negativeCount;
    if(idx == -1)
       negativeCount = nums.length;
    else 
       negativeCount = idx;


    // Find first > 0
    lo = 0;
    hi = nums.length - 1;
    idx = -1;

    while (lo <= hi) {

        int mid = (lo + hi) / 2;

        if (nums[mid] > 0) {
            idx = mid;
            hi = mid -1;
        } else {
            lo = mid +1;
        }
    }

    int positiveCount;

    if(idx == -1)
       positiveCount = 0;
    else
       positiveCount = nums.length - idx;

    

    return Math.max(negativeCount, positiveCount);
  }
}