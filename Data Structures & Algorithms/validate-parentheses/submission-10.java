class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        if(s.length()==1)
        return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }
            else if(!stk.empty() && ((s.charAt(i)=='}' && stk.peek()=='{') || (s.charAt(i)==')' && stk.peek()=='(') 
            || (s.charAt(i)==']' && stk.peek()=='[')))
            stk.pop();
            else
            return false;
        }
        return stk.empty();
    }
}
