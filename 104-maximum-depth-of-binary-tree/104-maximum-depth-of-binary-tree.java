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
    public int maxDepth(TreeNode root) {
        
                    
       /** Iterative approach 
       
       if(root == null) {
	        return 0;
	    }
		int level=0;
		
		Queue<TreeNode> queue= new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			int size=queue.size();
			while(size-- >0)
			{
			  TreeNode node = queue.poll();	
			  if(node.left!=null)
				{		
					queue.offer(node.left);
                }
			   if(node.right!=null)
				{
					queue.offer(node.right);
				}
			}
			level++;
		}
		
				
		return level;
        
       **/ 
        
        /**Recursive method **/
    
        if(root == null) {
	        return 0;
	    }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
        /**Recursion Tree 
                    [3] 1+(1,2)---3
                /       \
    --1 1+(0,0)[9]       [20] 1+(1,1) ---2
                        /   \
            1---- 1+(0,0)  [15] [7] 1+(0,0) ---1
                        
        **/
    }
}