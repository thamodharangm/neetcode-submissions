class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
        return false;

        int row=matrix.length;
        int col=matrix[0].length;

        int left=0;
        int right=row*col-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            int r=mid/col;
            int c=mid%col;

            int val=matrix[r][c];

            if(val==target){
                return true;
            }
            else if(val<target){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return false;
    }
    }

