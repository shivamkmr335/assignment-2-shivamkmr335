/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;
public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.Insert(50);
        tree.Insert(40);
        tree.Insert(65);
        tree.Insert(55);
        tree.Insert(10);
        tree.Insert(20);
        tree.Insert(100);
        tree.Insert(35);
        MyQueue mq = new MyQueue();
        mq.preSuccessor(tree.getRoot());
        System.out.print("\nPre-Order successor of all the nodes of BST ==>>  ");
        mq.getPreSucc();

    }
}
