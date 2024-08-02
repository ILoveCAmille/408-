package com.zhj.tree;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 12:04
 */
public class lowestCommonAncestor {
    TreeNode ans=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       this.dfs(root,p,q);
        return this.ans;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return false;
        boolean lson=dfs(root.left,p,q);
        boolean rson=dfs(root.right,p,q);
        if((lson&&rson)||((root.val==p.val||root.val==q.val)&&(lson||rson))){
            ans=root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }
}
