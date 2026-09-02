class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int lo=0, hi=n-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid+1]) hi=mid; // peak & dec
            else lo=mid+1; // inc
        }
        return lo;
    }
}