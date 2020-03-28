/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        MyBinarySearchTree bst=new MyBinarySearchTree();
        bst.Insert(55);
        bst.Insert(5);
        bst.Insert(10);
        bst.Insert(2);
        bst.Insert(12);
        bst.Insert(7);
        bst.Insert(3);
        bst.Insert(1);
        bst.traverse();
    }
}
