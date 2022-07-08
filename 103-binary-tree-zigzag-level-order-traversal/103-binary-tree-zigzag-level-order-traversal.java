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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(root==null)
            return ans;
        int level=1;
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr==null){
                if(!q.isEmpty())
                    q.add(null);
                if(level%2==0)
                    Collections.reverse(temp);

                ans.add(new ArrayList<Integer>(temp));
                level++;
                temp.clear();
            }
            else{
                temp.add(curr.val);

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return ans;
        
    }
}