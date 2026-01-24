class Solution {
    public int residuePrefixes(String s) {
       HashMap<Character,Integer> map  = new HashMap<>();
       int count =0;
       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        if(map.size() == ((i+1)%3)){
            count++;
        }
       }
       return count;
    }
}