/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
       
        List<List<Integer>> res = new ArrayList();
        
        if(root==null)
            return res;
        q.add(root);
      
        while(! q.isEmpty()){
            
             List<Integer> ans = new ArrayList();
            int s= q.size();
            
            for(int i=0;i<s;i++){
               TreeNode v = q.poll();
                ans.add(v.val);
                if(v.left!=null) {
                     q.add(v.left);
                    
                }
                if(v.right!=null) {
                        q.add(v.right);
                   
                }
                
            }
            res.add(ans);
        }
        
        return res;
    }
}