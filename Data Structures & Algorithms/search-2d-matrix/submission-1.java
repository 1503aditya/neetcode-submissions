class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int Rows=matrix.length;
        int Cols=matrix[0].length;
        int top=0,bot=Rows-1;
        while(top<=bot){
            int row=(top+bot)/2;
            if(matrix[row][Cols-1]<target)
            top=row+1;
            else if(matrix[row][0]>target)
            bot=row-1;
            else break;
        }
        if(top> bot)
        return false;
            int row=(top+bot)/2,start=0,end=Cols-1;
            while(start<=end){
                int mid=(end+start)/2;
                if(matrix[row][mid]<target){
                    start=mid+1;
                }
                else if(matrix[row][mid]>target){
                    end=mid-1;
                }else return true;
            }
        return false;
            
    }
}
