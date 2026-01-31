class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar = target-0;
        int ans =Integer.MAX_VALUE;
        char as = letters[0];
        for(int i=0;i<letters.length;i++){
           if(tar <letters[i]-0){
            if(ans>letters[i]-0){
                ans = letters[i]-0;
                 as = letters[i];
            }
           }
        }
        return  as;
    }
}