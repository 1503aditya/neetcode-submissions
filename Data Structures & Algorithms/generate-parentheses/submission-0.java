class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> res=new ArrayList<>();
      Stack<Character> stack=new Stack<>();
      backTrack(n,0,0,stack,res);  
      return res;
    }
    private void backTrack(int n, int openN, int closeN, Stack<Character> stack
    , List<String> res){
        if(openN==closeN && openN==n){
            StringBuilder sb = new StringBuilder();
            for(char c: stack){
                sb.append(c);
            }
            res.add(sb.toString());
            return ;
        }
        if(openN<n){
            stack.push('(');
            backTrack(n,openN+1,closeN,stack,res);
            stack.pop();
        }
        if(closeN<openN){
            stack.push(')');
            backTrack(n,openN,closeN+1,stack,res);
            stack.pop();
        }
    }
    
}
