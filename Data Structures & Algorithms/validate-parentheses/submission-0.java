class Solution {
    public boolean isValid(String s) {

        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char c: arr){
            if (c == '[' || c == '(' ||c == '{'){
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char tp= st.pop();
                if (tp =='[' && c != ']') return false; ;
                if (tp =='(' && c != ')') return false; ;
                if (tp =='{' && c != '}') return false; ;


        }
       
    }
    return st.isEmpty(); 
}
}
