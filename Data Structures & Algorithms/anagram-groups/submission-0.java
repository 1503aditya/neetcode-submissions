class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s : strs){// Pick each string
            //Break the string to char array tos sort it
            char[] s1=s.toCharArray();
            //Sort the array
            Arrays.sort(s1);
            //Change the value back to string
            String sortedS=new String(s1);
            //Check if the string is present in the List. If not then add it as key
            map.putIfAbsent(sortedS, new ArrayList<>());
            //Add the original string s as value
            map.get(sortedS).add(s);
        }
        //res.values() gives a Collection<List<String>>

//Wrapping it with new ArrayList<>(...) converts it to a List<List<String>>
        return new ArrayList<>(map.values());

    }
}
