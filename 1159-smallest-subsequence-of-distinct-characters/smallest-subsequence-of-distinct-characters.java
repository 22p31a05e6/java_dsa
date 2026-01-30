class Solution {
    public String smallestSubsequence(String s) {
     int  n = s.length();
     int []last = new int [26];
     for(int i=0;i<n;i++){
        last[s.charAt(i)-'a'] = i;
     }
     boolean [] visited = new boolean[26];
     StringBuilder stack = new StringBuilder ();
     for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        int idx = ch -'a';
        if (visited[idx]) continue;
          while(stack.length()>0){
                            char top = stack.charAt(stack.length() - 1);
                if (top > ch && last[top - 'a'] > i) {
                    visited[top - 'a'] = false;
                    stack.deleteCharAt(stack.length() - 1);
                } else {
                    break;
                }

          }
          stack.append(ch);
          visited[idx] = true;
      } 
      return stack.toString();
    }
}