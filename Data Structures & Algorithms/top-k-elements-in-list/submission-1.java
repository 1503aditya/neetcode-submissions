class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Key will be num, value will be frequency
        Map<Integer,Integer> map=new HashMap<>();
        //Store Array of list. If 1 comes 4 time then 1 will be in 4th pos
        List<Integer>[] list=new List[nums.length+1];
        //Adding num in Map
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            map.put(nums[i],1);
        }
        //Storing number on the pos of their frequency
        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(list[frequency] == null){
                list[frequency] = new ArrayList<>();
            }
            list[frequency].add(key);
        }
        int[] res=new int[k];
        int counter=0;
        for(int pos=list.length-1;pos>=0 && counter<k; pos--){
            if(list[pos]!=null){
                for(Integer integer: list[pos])
                res[counter++]=integer;
            }
        }
        return res;
    }
}
