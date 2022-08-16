class Solution {
    public List<String> generateParenthesis(int n) {
             List<String> res = new ArrayList();
        helper("",res,0,0,n);
        return res;
    }
    public void helper(String curr,List<String> res,int open,int close,int max){
        if(curr.length()==2*max){
            res.add(curr);
            return;
        }
        if(open<max){
            helper(curr + "(",res,open+1,close,max);
        }
        if(close<open){
            helper(curr + ")",res,open,close+1,max);
        }
    }
        
    
}