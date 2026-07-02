class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0 || s.length()==1)
        return true;
        s=s.toLowerCase();
        
        int j=s.length()-1;
        for(int i=0;i<=j;i++){
            while(i<=j && (s.charAt(i)<'a' || s.charAt(i)>'z') && (s.charAt(i)<'0' || s.charAt(i)>'9')){
                i++;
            }
            
            while(i<=j && (s.charAt(j)<'a' || s.charAt(j)>'z') && (s.charAt(j)<'0' || s.charAt(j)>'9')){
                j--;
            }
            
            if(i<=j && s.charAt(i)!=s.charAt(j))
            return false;
            j--;
        }
        return true;
    }
}
