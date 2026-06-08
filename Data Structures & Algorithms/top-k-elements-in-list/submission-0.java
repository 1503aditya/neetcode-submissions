class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>[] list=new List[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            map.put(nums[i],1);
        }
        for(int key : map.keySet()){
            int frequency=map.get(key);
            if(list[frequency]==null){
                list[frequency] = new ArrayList<>();
            }
            list[frequency].add(key);
        }
        int[] res=new int[k];
        int counter=0;
        for(int pos=list.length-1;pos>=0 & counter <k;pos--){
            if(list[pos]!=null){
                for(Integer integer: list[pos])
                res[counter++]=integer;
            }
        }
        return res;
    }
}
