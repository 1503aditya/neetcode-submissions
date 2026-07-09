class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<String, List<String>>();
        for(String s : strs){
            char[] s1=s.toCharArray();
            Arrays.sort(s1);
            String sortedS= new String(s1);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
