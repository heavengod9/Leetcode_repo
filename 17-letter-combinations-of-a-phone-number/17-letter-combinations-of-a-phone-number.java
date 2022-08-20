class Solution {
    public List<String> letterCombinations(String digits) {
        
     List<String> result = new ArrayList();
        if(digits==null || digits.length()==0){
            return result;
        }
        String[] mappings ={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(result,digits,0,"",mappings);
        return result;

    }
    public void helper(List<String> result,String digits,int index,String current,String[] mappings){
        if(index==digits.length()){
            result.add(current);
            return;
        }
        String letters = mappings[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            helper(result,digits,index+1,current+letters.charAt(i),mappings);
        }

    }
}