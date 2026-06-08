class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n:nums)
        numSet.add(n);
        int max=0;
        for(int n:numSet){
            if(!numSet.contains(n-1)){
                int length=1;
                while(numSet.contains(n+length)){
                    length++;
                }
                max=Math.max(max,length);
            }
        }
        return max;
    }
}
