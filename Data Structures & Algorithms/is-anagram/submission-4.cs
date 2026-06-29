public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length!=t.Length)
        return false;
        Dictionary<char,int> map=new Dictionary<char,int>();
        for(int i=0;i<s.Length;i++){
            if(map.ContainsKey(s[i])){
                map[s[i]]++;
            }else{
                map[s[i]]=1;
            }
             if(map.ContainsKey(t[i])){
                map[t[i]]--;
            }else{
                map[t[i]]=-1;
            }
        }
        foreach (int val in map.Values) {
            if(val!=0)
            return false;
        }
        return true;
    }
}
