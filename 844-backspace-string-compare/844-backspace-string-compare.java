class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
         Stack<Character> stack2 = new Stack<>();
        for(char c :s.toCharArray()){
            if(c!='#'  ){
                stack1.push(c);
            }
            else if(!stack1.isEmpty())
                stack1.pop();
        }
        
        for(char c :t.toCharArray()){
            if(c!='#'  ){
                stack2.push(c);
            }
            else if(!stack2.isEmpty())
                stack2.pop();
        }
        while(!stack1.isEmpty()){
            char current = stack1.pop();
            if(stack2.isEmpty() || stack2.pop()!=current)
                return false;
        }
        return stack1.isEmpty() && stack2.isEmpty();
    }
}