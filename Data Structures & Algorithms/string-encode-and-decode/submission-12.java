class Solution {

    public String encode(List<String> strs) {//i=0,j=1;len=4;i=5
        String s="";//4#ABCD
        System.out.println(s.length());
        for(int i=0;i<strs.size();i++){
            s=s+strs.get(i).length()+"#"+strs.get(i);
        }
        System.out.println(s);
        return s;
    }
    public List<String> decode(String str) {
        ArrayList<String> list=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#')
            j++;
            int len=Integer.valueOf(str.substring(i,j));
            i=1+j+len;
            list.add(str.substring(j+1,i));
        }
        return list;
    }
}
