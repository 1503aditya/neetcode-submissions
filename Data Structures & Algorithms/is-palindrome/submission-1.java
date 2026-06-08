class Solution {
    public boolean isPalindrome(String s) {
        int end=s.length()-1,start=0;
        while(start<end){
            if((((int)s.charAt(start)>=48 && (int)s.charAt(start)<=57)) || ((int)s.charAt(start)>=65 && (int)s.charAt(start)<=90) || ((int)s.charAt(start)>=97 && (int)s.charAt(start)<=122)){
            }
            else{start++;
                continue;}
            if(((int)s.charAt(end)>=48 && (int)s.charAt(end)<=57) || ((int)s.charAt(end)>=65 && (int)s.charAt(end)<=90) || ((int)s.charAt(end)>=97 && (int)s.charAt(end)<=122)){
            }else{end--;
                continue;}
            if((s.charAt(start)+"").equalsIgnoreCase((s.charAt(end))+"")){
                start++;end--;
            }else
            return false;
            
        }
        return true;
    }
}
