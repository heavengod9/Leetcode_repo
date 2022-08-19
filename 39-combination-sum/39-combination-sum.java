class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
      List<List<Integer>> res = new ArrayList();
        //Arrays.sort(candidates);
        helper(0,candidates,target,res,new ArrayList<>());
        return res;
    }
    static void helper(int index,int[] arr,int target,List<List<Integer>> res,List<Integer> ans){
        if(index==arr.length){
            if(target==0){
                res.add(new ArrayList(ans));
            }
            return;
        }
        if(arr[index]<=target){
            ans.add(arr[index]);
            helper(index,arr,target-arr[index],res,ans);
            ans.remove(ans.size()-1);
        }
        helper(index+1,arr,target,res,ans);

    }   
    
}