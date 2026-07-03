class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] arr = s.toCharArray();

        // String rev = "";
        // for(int i=s.length()-1;i>=0;i--){
        //     rev += s.charAt(i);
        // }
        // if(s.equals(rev)){
        //     return true;
        // }
        // return false;

        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            } else{
                i++;
                j--;
            }
        }
        return true;
    }
}