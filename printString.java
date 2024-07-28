class Solution {
    public String printString(String s, char ch, int count) {
        StringBuilder str=new StringBuilder();
       int c=0;
        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
           if(p==ch)
              c++;
            if(c==count){
              /*  if(p==ch)
                   continue;
                else
                   str.append(p);*/
                   if (i + 1 < s.length()) {
                        str.append(s.substring(i + 1));
                   }
            
            break;
            }
               
       }
       return str.toString();
    }
}
