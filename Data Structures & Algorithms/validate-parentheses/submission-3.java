class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        Map<Character,Character> map=new HashMap<>();

        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                     st.push(c);
            }
           else{
            if(st.isEmpty()) return false;
               
               char top=st.pop();

               if(top!=map.get(c)){
                return false;
               }
             
           }

        }
        

return  st.isEmpty();
    }
}
