class Solution {
    public int maxArea(int[] heights) {
        int max=0,k=0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                k=(int)Math.min(heights[i],heights[j]);
                max=(int)Math.max(max,k*(j-i));
            }
        }
        return max;
    }
}
