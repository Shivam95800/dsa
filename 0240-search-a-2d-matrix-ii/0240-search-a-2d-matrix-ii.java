class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        int m = arr.length, n= arr[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]== tar) return true;
            }
        }
        return false;
    }
}