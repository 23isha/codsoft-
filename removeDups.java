class Solution {
    String removeDups(String str) {
        StringBuilder dup=new StringBuilder();
        boolean[] seen=new boolean[300];
        for(char c:str.toCharArray()){
            if(!seen[c]){
                dup.append(c);
                seen[c]=true;
            }
        }
        return dup.toString();
    }
}
