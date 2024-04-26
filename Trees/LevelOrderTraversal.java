package ust.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

}

/**
 * Definition for a binary tree node.
 *
 */
class TreeNode {
  int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if(root==null) return ans;
        else{
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            
            
            while(!q.isEmpty()){
                
                ArrayList<Integer> sub = new ArrayList<>();
                int size = q.size();
                for(int i=0;i<size;i++){

                    if(q.peek().left!=null) q.add(q.peek().left);
                    if(q.peek().right!=null) q.add(q.peek().right);
                    sub.add(q.poll().val);
                }
                ans.add(sub);
            }
        }

        return ans;

    }
}