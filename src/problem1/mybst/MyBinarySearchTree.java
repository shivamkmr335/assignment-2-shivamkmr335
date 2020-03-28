/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root = null;
    public int leftCount;
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    public void traverse() {
        TreeNode temp = root;
        trav(temp);
        System.out.println("\nThe BST has "+leftCount+"  nodes who doesn't have left child");
    }
    private void trav(TreeNode node){
        if (node == null) {
            return;
        }
        if(node.getLeft()==null){
            leftCount++;
        }
        trav(node.getLeft());
        System.out.print(node.getData()+"  ");
        trav(node.getRight());
    }
    public void Insert(int data) {
        if (root == null) {
            TreeNode temp = new TreeNode(data);
            root = temp;
        }
        insert(root, data);
    }
    private static TreeNode insert(TreeNode root, int x){
        if (root == null)
            return new TreeNode(x);
        else if(x>root.getData())
            root.setRight(insert(root.getRight(),x));
        else if(x<root.getData())
            root.setLeft(insert(root.getLeft(),x));
        return root;
    }
}
