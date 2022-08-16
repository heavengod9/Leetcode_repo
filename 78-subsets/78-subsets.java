class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> subsets = new ArrayList<>();
    helper(0,nums,new ArrayList<Integer>(),subsets);
    return subsets;
    
  }
  public void helper(int index,int[] nums,List<Integer> curr,List<List<Integer>> subsets){
    subsets.add(new ArrayList<>(curr));

    for(int i=index;i<nums.length;i++){
      curr.add(nums[i]);
      helper(i+1,nums,curr,subsets);
      curr.remove(curr.size()-1);
    }
        
  }  
        
    
}