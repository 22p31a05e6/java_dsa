class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l= new ArrayList<>();
        int idx = 0; 
        for(int i=1;i<=n;i++){
            l.add("Push");
            if(idx < target.length && target[idx] == i){
                idx++;
                if(target.length == idx){
                    break;
                }
            }
            else{
                l.add("Pop");
            }
        }
        return l;
    }
}