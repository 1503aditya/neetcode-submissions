class Solution {
    public int maxArea(int[] heights) {
        int start=0,end=heights.length-1,res=0,area=0,len=0;
        while(start<end){
            len=end-start;
            area=len * (int)Math.min(heights[start],heights[end]);
            res=(int)Math.max(area,res);
            if(heights[start]>heights[end])
            end--;
            else
            start++;
        }
        return res;
    }
}
