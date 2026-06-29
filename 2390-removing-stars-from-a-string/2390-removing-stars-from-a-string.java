class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
            
        }
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();

    }
}